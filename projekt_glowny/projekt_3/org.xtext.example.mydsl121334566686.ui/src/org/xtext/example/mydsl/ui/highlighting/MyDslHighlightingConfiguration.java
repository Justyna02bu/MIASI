package org.xtext.example.mydsl.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class MyDslHighlightingConfiguration extends DefaultHighlightingConfiguration {
  public static final String LINKING_WARNING = "linkingWarning";

  @Override
  public void configure(IHighlightingConfigurationAcceptor acceptor) {
    super.configure(acceptor);
    acceptor.acceptDefaultHighlighting(
      LINKING_WARNING,
      "Linking Warnings",
      linkingTextStyle()
    );
  }

  public TextStyle linkingTextStyle() {
    TextStyle ts = defaultTextStyle().copy();
    ts.setColor(new RGB(128, 0, 128));
    ts.setStyle(SWT.ITALIC);
    return ts;
  }
}
