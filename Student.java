// This class has getters and setters to get and set the variables firstName, lastName , grade and Student Number
//This class has a constructor with parameters from other class. Every time student object is created, this Constructor will be called
public class Student {

    String firstName, lastName, grade;
    int number;

    public Student(String firstName, String lastName, String grade, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGrade() {
        return grade;
    }

    public int getNumber() {
        return number;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}