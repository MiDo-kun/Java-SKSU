package Chapter8a;

import java.awt.*;
import java.awt.event.*;

public class CloseFrameUsingAdapterClass {
  Label label;
  CFListener w = new CFListener(this);

  CloseFrameUsingAdapterClass(String title) {
    super(title);
    label = new Label("Close the frame.");
    this.addWindowListener(w);
  }

  void launchFrame() {
    setSize(300, 300);
    setVisible(true);
  }

  public static void main(String args[]) {
    CloseFrame cf = new CloseFrame("Close Window Example");
    cf.launchFrame();
  }

  class CFListener extends WindowAdapter {
    CloseFrame ref;
    CFListener(CloseFrame ref) {
      this.ref = ref;
    }

    public void windowClosing(WindowEvent e) {
      ref.dispose();
      System.exit(1);
    }
  }
}
