package Chapter11a;

import java.awt.*;
import java.applet.*;

/*
 * <applet code="ParamDemo" width=300 height=100>
 *  <param name="myParam" value="Hello World">
 * </applet>
 */

public class ParamDemo extends Applet {
  public void paint(Graphics g)  {
    g.drawString(getParameter("myParam"), 80, 25);
  }
}
