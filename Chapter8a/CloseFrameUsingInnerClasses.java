package Chapter8a;

import java.awt.*;
import java.awt.event.*;

class CloseFrameUsingInnerClasses extends Frame {
  Label label;

  CloseFrameUsingInnerClasses(String title) {
    super(title);
    label = new Label("Close the frame.");
    this.addWindowListener(new CFListener());
  }

  void launchFrame() {
    setSize(300, 300);
    setVisible(true);
  };

  class CFListener extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
      dispose();
      System.exit(1);
    }
  }

  public static void main(String args[]) {
    CloseFrame cf = new CloseFrame("Close Window Example");
    cf.launchFrame();
  }
}
