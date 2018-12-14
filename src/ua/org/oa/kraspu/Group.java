package ua.org.oa.kraspu;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Group {

  private String groupName;
  Scanner sc = new Scanner(System.in);
  char ch;
  ArrayList<Student> studGroup = new ArrayList<>(5);


  public Group() throws MyException {

    System.out.println("Enter the name of new the Group: ");
    setGroupName(sc.nextLine());

    do {
      System.out.println("Enter new student's: ");

      String fn = enterName();

      String ln = enterSurname();

      int ag = enterAge();

      studGroup.add(new Student(fn,ln,ag));

      System.out.println("To continue enter any symbol(to exit press 'q'): ");

      ch = sc.next().charAt(0);

    } while (ch != 'q');

    for (Student gr : studGroup) {
      System.out.println(gr.toString());
    }
  }

  public String enterName(){
    System.out.println("FirstName: ");
    return sc.nextLine();
  }
  public String enterSurname(){
    System.out.println("LastName: ");
    return sc.nextLine();
  }
  public int enterAge(){
    System.out.println("LastName: ");
    return sc.nextInt();
  }

  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Group group = (Group) o;
    return  Objects.equals(groupName, group.groupName) &&
            Objects.equals(studGroup, group.studGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, sc, ch, studGroup);
  }

  @Override
  public String toString() {
    return "Group{" +
            "groupName='" + groupName + '\'' +
            ", studGroup=" + studGroup +
            '}';
  }
}
