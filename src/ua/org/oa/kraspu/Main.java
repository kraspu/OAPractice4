package ua.org.oa.kraspu;

public class Main {

  public static void main(String[] args) throws MyException {

    try {
    //  Student stud1 = new Student("Al", "Vanin", 17);
    //  Student stud2 = new Student("Aly", "Vaninyushechkinov", 17);
//      Student stud3 = new Student("Aly", "Vanin", 11);
      Group group = new Group();


    } catch (MyException error) {
      System.out.println(error.getLocalizedMessage());
    }
  }
}
