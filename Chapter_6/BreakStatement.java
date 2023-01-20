package Chapter_6;

public class BreakStatement {
  public static void main(String[] args) {
    String names[] = {"Beah", "Bianca", "Lance", "Belle", "Nico", "Yza", "Gem", "Ethan"};
    String searchName = "Yza";
    boolean foundName = false;

    for (int i = 0; i < names.length; i++) {
      if (names[i].equals(searchName)) {
        foundName = true;
        break;
      }
    }

    if (foundName) {
      System.out.println(searchName + " was found!");
    } else {
      System.out.println(searchName + " was not found!");
    }
  }
}