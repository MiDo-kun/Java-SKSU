package Chapter11a;

import java.awt.*;
import java.applet.*;

public class ShowStatusMethod extends Applet {
  public void paint(Graphics g) {
    g.drawString("Hello World!", 80, 25);
    showStatus("This is important information.");
  } 
}
