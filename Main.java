// This class creates object for class School and is used to run the overall program
//This class also calls methods in School object to add, delete and display students & teachers
public class Main {
    public static void main(String[] args) {

        //Create a school object for School Class with Constructor
        School school = new School("Moscrop", "Burnaby", "BC");

        //Add 10 students to students list
        for (int i = 0; i < 10; i++) {
            school.addStudent("Sreeja" , "Lingam" + (i+1), "A");
        }

        //Add 3 teachers to teachers list
        for (int i = 0; i < 3; i++) {
            school.addTeacher(new Teacher("Vis" , "Mu" +(i+1), "Java"));
        }

        //Display school name, city and province
        System.out.println("School Information : " + school.getName() + " ," + school.getCity() + " ," + school.getProvince());
        System.out.println();

        //Display all students on console
        school.showAllStudents();

        //Display all teachers on console
        school.showAllTeachers();

        //Remove 2 students from the list
        school.deleteStudent();
        school.deleteStudent();

        //Remove 1 teacher from the list
        school.deleteTeacher();

        //Display all students on console
        school.showAllStudents();

        //Display all teachers on console
        school.showAllTeachers();
    }
}