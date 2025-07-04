package org.xtext.example.mydsl.ui.handlers;

import java.io.File;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;


public class ExportModelHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IEditorPart editorPart = HandlerUtil.getActiveEditor(event);
        if (editorPart instanceof XtextEditor xtextEditor) {
            xtextEditor.getDocument().readOnly((XtextResource resource) -> {
                try {
                    URI originalUri = resource.getURI();
                    String platformString = originalUri.toPlatformString(true);
                    if (platformString == null) {
                        MessageDialog.openError(HandlerUtil.getActiveShell(event),
                                "Błąd eksportu",
                                "Nie można uzyskać ścieżki do pliku. Upewnij się, że plik został zapisany na dysku.");
                        return null;
                    }

                    IFile iFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(platformString));
                    IPath location = iFile.getLocation();
                    if (location == null) {
                        MessageDialog.openError(HandlerUtil.getActiveShell(event),
                                "Błąd eksportu",
                                "Nie można znaleźć lokalizacji pliku na dysku.");
                        return null;
                    }

                    // Generowanie unikalnej ścieżki XMI
                    String originalPath = location.toOSString();
                    URI xmiUri = getAvailableFileURI(originalPath.replaceAll("\\.mydsl2?$", ".xmi"));

                    EObject root = resource.getContents().isEmpty() ? null : resource.getContents().get(0);
                    if (root == null) {
                        MessageDialog.openError(HandlerUtil.getActiveShell(event),
                                "Błąd eksportu",
                                "Nie znaleziono modelu do eksportu.");
                        return null;
                    }

                    resource.getResourceSet()
                            .getResourceFactoryRegistry()
                            .getExtensionToFactoryMap()
                            .put("xmi", new XMIResourceFactoryImpl());

                    Resource xmiResource = resource.getResourceSet().createResource(xmiUri);
                    xmiResource.getContents().add(root);
                    xmiResource.save(Collections.emptyMap());

                    MessageDialog.openInformation(HandlerUtil.getActiveShell(event),
                            "Eksport zakończony",
                            "Plik zapisano jako:\n" + new File(xmiUri.toFileString()).getAbsolutePath());
                    System.out.println("Eksport zakończony: " + xmiUri.toFileString());

                } catch (Exception e) {
                    e.printStackTrace();
                    MessageDialog.openError(HandlerUtil.getActiveShell(event),
                            "Błąd eksportu",
                            "Wystąpił wyjątek: " + e.getMessage());
                }
                return null;
            });
        }
        return null;
    }

    private URI getAvailableFileURI(String basePath) {
        File file = new File(basePath);
        if (!file.exists()) {
            return URI.createFileURI(file.getAbsolutePath());
        }

        String baseName = basePath.replaceFirst("\\.xmi$", "");
        int counter = 1;
        while (true) {
            String newPath = baseName + counter + ".xmi";
            File newFile = new File(newPath);
            if (!newFile.exists()) {
                return URI.createFileURI(newFile.getAbsolutePath());
            }
            counter++;
        }
    }
}
