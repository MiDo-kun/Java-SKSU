package Chapter11a;

import java.awt.*;
import java.applet.*;

public class AudioApplet extends Applet {
  AudioClip ac;

  public void init() {
    try {
      // Audio clip is saved in same directory as java code.
      ac = getAudioClip(getCodeBase(), "spaceMusic.au");
      ac.loop();
    } catch (Exception e){
      System.out.println(e);
    }
  }

  public void stop() {
    ac.stop();
  }

  public void paint(Graphics g) {
    g.drawString("Playing space music!", 80, 25);
  }
}
