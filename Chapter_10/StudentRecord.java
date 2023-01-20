package Chapter_10;

public class StudentRecord {
  public String name;
  private String address;
  private int age;
  private double mathGrade;
  private double englishGrade;
  private double scienceGrade;
  private double average;
  private static int studentCount;

  public StudentRecord() {
    this("Trying Chained Constructor");
  }

  public StudentRecord(String temp) {
    this.name = temp;
    System.out.println("public StudentRecord (String temp) \n" + "Name: " + temp);
  }

  public StudentRecord(String name, String address) {
    this.name = name;
    this.address = address;
    System.out.println("public StudentRecord(String name, String address) \n" +
        "Name: " + name + "\n" + "Address: " + address);
  }

  public StudentRecord(double mGrade, double eGrade, double sGrade) {
    mathGrade = mGrade;
    englishGrade = eGrade;
    scienceGrade = sGrade;
    System.out.println(
        "public StudentRecord(double mGrade, double eGrade, double sGrade) \n" +
            "Math Grade: " + mathGrade + "\n" +
            "English Grade: " + englishGrade + "\n" +
            "Science Grade: " + scienceGrade + "\n");
  }

  // Note: methods with a name of set as prefix can be identified as mutators
  public void setName(String temp) {
    name = temp;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setMathGrade(double mathGrade) {
    this.mathGrade = mathGrade;
  }

  public void setEnglishGrade(double englishGrade) {
    this.englishGrade = englishGrade;
  }

  public void setScienceGrade(double scienceGrade) {
    this.scienceGrade = scienceGrade;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }

  public double getMathGrade() {
    return mathGrade;
  }

  public double getEnglishGrade() {
    return englishGrade;
  }

  public double getScienceGrade() {
    return scienceGrade;
  }

  public double getAverage() {
    this.average = (mathGrade + englishGrade + scienceGrade) / 3;
    return this.average;
  }

  public static int getStudentCount() {
    return studentCount;
  }

  public void print(String temp) {
    System.out.println("Name: " + name);
    System.out.println("Address: " + address);
    System.out.println("Age" + age);
  }

  public void print(double eGrade, double mGrade, double sGrade) {
    System.out.println("Name: " + name);
    System.out.println("Math Grade: " + mGrade);
    System.out.println("English Grade: " + eGrade);
    System.out.println("Science Grade: " + sGrade);
  }

  public static class StudentRecordExample {
    public static void main(String[] args) {
      StudentRecord annaRecord = new StudentRecord();
      StudentRecord beahRecord = new StudentRecord();
      StudentRecord crisRecord = new StudentRecord();

      System.out.println("Instantiating Objects");
      annaRecord.setName("Anna");
      beahRecord.setName("Beah");
      crisRecord.setName("Cris");

      System.out.println(annaRecord.getName());
      System.out.println("Count = " + StudentRecord.getStudentCount() + "\n");

      System.out.print("Using Setters and Getters \n");
      annaRecord.setName("Anna");
      annaRecord.setAddress("Philippines");
      annaRecord.setAge(15);
      annaRecord.setMathGrade(80);
      annaRecord.setEnglishGrade(95.5);
      annaRecord.setScienceGrade(100);

      System.out.println(
          "Name: " + annaRecord.getName() + "\n" +
              "Address: " + annaRecord.getAddress() + "\n" +
              "Age: " + annaRecord.getAge() + "\n" +
              "Math Grade: " + annaRecord.getMathGrade() + "\n" +
              "English Grade: " + annaRecord.getEnglishGrade() + "\n" +
              "Science Grade: " + annaRecord.getScienceGrade() + "\n" +
              "Average: " + annaRecord.getAverage() + "\n");

      System.out.println("Using Function Overloading");
      new StudentRecord("");
      new StudentRecord("Anna");
      new StudentRecord("Anna", "Philippines");
      new StudentRecord(90, 85, 60);
    }
  }

}
