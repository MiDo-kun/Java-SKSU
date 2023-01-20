package Chapter_10;

import javax.swing.JOptionPane;

public class CreateClass {
  private static String name;
  private static String address;
  private static int age;
  private static double mathGrade;
  private static double englishGrade;
  private static double average;
  static final int ages = 10;

  public static void main(String[] args) {
    setStudent();

    JOptionPane.showMessageDialog(null, name);
    JOptionPane.showMessageDialog(null, address);
    JOptionPane.showMessageDialog(null, age);
    JOptionPane.showMessageDialog(null, mathGrade);
    JOptionPane.showMessageDialog(null, englishGrade);
    JOptionPane.showMessageDialog(null, average);
  }

  // Set students information at this function
  public static void setStudent() {
    name = JOptionPane.showInputDialog(" Name: ");
    address = JOptionPane.showInputDialog(" Address: ");
    String inputAge = JOptionPane.showInputDialog(" Age: ");
    age = Integer.parseInt(inputAge);
    String inputMathGrade = JOptionPane.showInputDialog(" Math Grade: ");
    mathGrade = Integer.parseInt(inputMathGrade);
    String inputEnglishGrade = JOptionPane.showInputDialog(" English Grade: ");
    englishGrade = Integer.parseInt(inputEnglishGrade);
  }
}