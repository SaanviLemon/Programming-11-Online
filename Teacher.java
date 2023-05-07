
// This class has getters and setters to get and set the variables firstName, lastName and subject
////This class has a constructor with parameters from other class. Every time Teacher object is created, this Constructor will be called
public class Teacher {

    String firstName, lastName, subject;
    //constructor
    public Teacher(String firstName, String lastName, String subject) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}




