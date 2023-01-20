package Chapter_6;
public class GradeIfELseStatement{
  public static void main(String[] args) {
    double grade = 92.0;

    if (grade >= 90)
      System.out.println("Excellent!");
    else if ((grade < 90) && (grade >= 80))
      System.out.println("Good Job!");
    else if ((grade < 80) && (grade >= 60))
      System.out.println("Study Harder!");
    else
      System.out.println("Sorry, you have failed.");
  }
}