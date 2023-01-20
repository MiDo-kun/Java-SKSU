package Chapter11a;

import java.applet.*;
import java.awt.*;

public class LifeCycleDemo extends Applet {
  String msg = "";

  public void init() {
    msg += "Initializing...";
    repaint();
  }

  public void start() {
    msg += "Starting...";
    repaint();
  }

  public void stop() {
    msg += "Stopping...";
    repaint();
  }

  public void destroy() {
    msg += "Preparing for unloading...";
    repaint();
  }

  public void paint(Graphics g) {
    g.drawString(msg, 15, 15);
  }
}
