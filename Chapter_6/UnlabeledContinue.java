package Chapter_6;

public class UnlabeledContinue {
  public static void main(String[] args) {
    String names[] = {"Beah", "Bianca", "Lance", "Belle", "Nico", "Yza", "Gem", "Ethan"};
    int count = 0;
    for (int i = 0; i < names.length; i++) {
      if (!names[i].equals("Bianca")) {
        continue;
      }
      count++;
    }

    System.out.println("There are " + count + " Bianca(s) in the list.");
  }
}
