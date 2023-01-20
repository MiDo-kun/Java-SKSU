package Chapter7a;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class SwingDemo {
  JFrame frame;
  JPanel panel;
  JTextField textField;
  JButton button;
  Container contentPane;

  void launchFrame() {
    // Initialization
    frame = new JFrame("My First Swing Application");
    panel = new JPanel();
    textField = new JTextField("Default Text");
    button = new JButton("Click me!");
    contentPane = frame.getContentPane();

    // Add components to panel-FlowLayout by default
    panel.add(textField);
    panel.add(button);

    // Add components to contentPane - BorderLayout
    contentPane.add(panel, BorderLayout.CENTER);
    frame.pack();
    frame.setVisible(true);
  }
  
  public static void main(String args[]){
    SwingDemo sd = new SwingDemo();
    sd.launchFrame();
  }
}
