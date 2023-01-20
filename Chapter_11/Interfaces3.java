package Chapter_11;

public class Interfaces3 implements Methods{  
  @Override
  public void showName(String name) {
    System.out.println("Hello There! " + name);    
  }

  public static void main(String[] args) {
    new Interfaces3().showName("Jerson");
  }
}
