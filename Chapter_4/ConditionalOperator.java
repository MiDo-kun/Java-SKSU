package Chapter_4;

public class ConditionalOperator {
  public static void main(String[] args) {
    String status = "";
    int grade = 30;

    // Get status of the student;
    status = (grade >= 60) ? "Passed" : "Fail";
    // Print status
    System.out.println("Status = " + status);
  }
}