package Chapter7a;

import java.awt.*;

public class BorderLayoutDemo extends Frame{
  public static void main(String args[]) {
    BorderLayoutDemo bld = new BorderLayoutDemo();
    bld.setLayout(new BorderLayout(10, 10));

    bld.add(new Button("NORTH"), BorderLayout.NORTH);
    bld.add(new Button("SOUTH"), BorderLayout.SOUTH);
    bld.add(new Button("EAST"), BorderLayout.EAST);
    bld.add(new Button("CENTER"), BorderLayout.CENTER);

    bld.setSize(400, 200);
    bld.setVisible(true);
  }
}
