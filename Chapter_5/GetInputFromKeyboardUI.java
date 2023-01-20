package Chapter_5;
import javax.swing.JOptionPane;

public class GetInputFromKeyboardUI {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Please Enter Your Name: ");
    String msg = "Hello " + name + "!";
    
    JOptionPane.showMessageDialog(null, msg);
  }
}