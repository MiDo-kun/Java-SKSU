package Chapter8a;

import java.awt.*;
import java.awt.event.*;

public class CloseFrameUsingAnonymousInnerClasses extends Frame {

  Label label;

  CloseFrameUsingAnonymousInnerClasses(String title) {
    super(title);
    label = new Label("Close the frame.");
    this.addWindowListener(WindowEvent e) {
      dispose();
      System.exit(1);
    }
  }

  void launchFrame() {
    setSize(300, 300);
    setVisisble(true);
  }

  public static void main(String args[]) {
    CloseFrame cf = new CloseFrame("Close Window Example");

    cf.launchFrame();
  }
}
