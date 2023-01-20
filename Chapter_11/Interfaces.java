package Chapter_11;

interface Example1 {
  final int num = 10;
  void string(String name);
  void integer(int a);
}

class ExampleMethod implements Example1 {
  public void string(String name) {
    System.out.println("string() method name is " + name);
  }

  public void integer(int num) {
    System.out.println("integer method num is " + num);
  }
};

class Interface {
  public static void main(String[] args) {
    Example1 showName = new ExampleMethod();
    showName.string("Jerson");
  }
}