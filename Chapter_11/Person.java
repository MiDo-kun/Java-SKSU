package Chapter_11;
// Note: You can refer to module and comment each part to 
public class Person {
  public interface SampleInterface {

    public boolean isGreater(Object a, Object b);
    public boolean isLess(Object a, Object b);
    public boolean isEqual(Object a, Object b);
  }
}

// public class Person extends Employee {
// @Override
// public void showClassEmployee() {
// System.out.println("Inherited Abstract Classes");
// }

// public static void main(String[] args) {
// new Person().showClassEmployee();
// new Person().normalMethod();
// }
// }

// interface Student {
// String name = "Set Student name here...";

// default void getNameStudent() {
// System.out.println("Student Name is " + name);
// }
// }

// interface Employee {
// String name = "Set employee name here...";

// default void getNameEmployee() {
// System.out.println("Employee Name is " + name);
// }
// }

// class Interface implements Student, Employee {
// }

// public class Person extends Interface {
// public static void main(String[] args) {
// Interface studInterface = new Interface();
// Person studentObject = new Person();
// studentObject.getNameStudent();
// Person employeeObject = new Person();
// employeeObject.getNameEmployee();
// }

// public void getNameStudent() {
// System.out.println("Performing function overriding in Student");
// }

// public void getNameEmployee() {
// System.out.println("Performing function overriding in Employee");
// }
// }

// protected String name;
// protected String address;

// Person(String name, String address) {
// this.name = name;
// this.address = address;
// }

// public Person(String name, String address) {
// Practicing different access modifiers
// System.out.print("Inside Person: Constructor \n");
// System.out.print("Studetn Name: " + name);
// this.name = name;
// this.address = address;
// }

// protected void showInfo() {
// System.out.print("Name: " + name + "\nAddress: " + address);
// }

// protected void showName() {
// System.out.println("The default name is " + this.name + "\n");

// public class Student {
// public void getName() {
// System.out.print("Student Name: " + name);
// }
// }
// }