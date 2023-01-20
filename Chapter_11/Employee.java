package Chapter_11;

public abstract class Employee {
  public void normalMethod() {
    System.out.println("This method doesn't have abstract keyword");
  }

  public abstract void showClassEmployee();
}

// public class Employee extends Person {
// public void personClass() {
// System.out.println("Overriding Person Class in Employee Class");
// }

// public static void main(String[] args) {
// Employee showClasEmployee = new Employee();
// showClasEmployee.personClass();
// }
// }