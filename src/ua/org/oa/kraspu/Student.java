package ua.org.oa.kraspu;

import java.util.Objects;

public class Student {

  private static final int NAME_MIN_LENGTH = 2;
  private static final int NAME_MAX_LENGTH = 15;
  public static final int MIN_AGE = 17;
  public static final int MAX_AGE = 100;
  private String firstName;
  private String lastName;
  private int age;


  public Student(String firstName, String lastName, int age) throws MyException{
    setFirstName(firstName);
    setLastName(lastName);
    setAge(age);
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) throws MyException {
    if (firstName.length() > NAME_MIN_LENGTH && firstName.length() < NAME_MAX_LENGTH) {
      this.firstName = firstName;
    }else {
      throw new MyException("FirstName can't be less then " + NAME_MIN_LENGTH +
              " and more then " + NAME_MAX_LENGTH);
    }
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) throws MyException{
    if (lastName.length() > NAME_MIN_LENGTH && lastName.length() < NAME_MAX_LENGTH) {
      this.lastName = lastName;
    }else {
      throw new MyException("LastName can't be less then " + NAME_MIN_LENGTH +
              " and more then " + NAME_MAX_LENGTH);
    }
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) throws MyException{
    if (age >= MIN_AGE && age <= MAX_AGE) {
      this.age = age;
    } else {
      throw new MyException("Age can't be less then " + MIN_AGE + " and more then " + MAX_AGE);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Student student = (Student) o;
    return age == student.age &&
            Objects.equals(firstName, student.firstName) &&
            Objects.equals(lastName, student.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, age);
  }

  @Override
  public String toString() {
    return "Student{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", age=" + age +
            '}';
  }
}
