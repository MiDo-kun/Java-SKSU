package Chapter11a;

import java.awt.*;
import java.applet.*;
/*
 * Insert this part in the html code
 * <applet code="AppletDemo" width=300 height=100>
 * </applet>
 */


public class AppletDemo extends Applet {
  public void paint(Graphics g) {
    g.drawString("Hello World!", 80, 25);
  }
  public static void main(String args[]) {

  }
}
