import java.util.ArrayList; // import the ArrayList class

// This class has 2 arraylists namely Teachers and Students
// This class has methods to add a student, add a teacher, remove a teacher, remove a student and display all student & teacher names
public class School {

    //  Teachers ArrayList stores all the teacher details
    ArrayList<Teacher> Teachers = new ArrayList<Teacher>();

    //  Students ArrayList stores all the student details
    ArrayList<Student> Students = new ArrayList<Student>();

    // name, city and Province fields are used to store school information
    String name, city, province;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    //Constructor
    School(String name, String city, String province) {
        this.name = name;
        this.city = city;
        this.province = province;
    }

    //Add a teacher to Teachers ArrayList
    public void addTeacher(Teacher teacher) {
        Teachers.add(teacher);
    }

    //Add a student to Students ArrayList. Also has the logic to generate a unique ID for Student
    public void addStudent(String firstName, String lastName, String grade) {
        Student student = new Student(firstName, lastName, grade, 0);
        int sno = 0;
        if (Students.size() > 0) {

            Student st = Students.get(Students.size() - 1);
            sno = st.getNumber();
        }
        student.setNumber(sno + 1);
        Students.add(student);

    }

    //Delete a student from Students ArrayList
    public void deleteStudent() {
        if (Students.size() > 0)
            Students.remove(Students.size() - 1);
    }

    //Delete a teacher from Teachers ArrayList
    public void deleteTeacher() {
        if (Teachers.size() > 0)
            Teachers.remove(Teachers.size() - 1);
    }

    //Display all the teachers from Teachers ArrayList
    public void showAllTeachers() {
        System.out.println("Teachers List : ");
        System.out.println();
        for (Teacher t : Teachers) {
            System.out.println("Name: " + t.getFirstName() + " " + t.getLastName() + " Subject: " + t.getSubject());
        }
        System.out.println();
    }

    //Display all the students from Students ArrayList
    public void showAllStudents() {
        System.out.println("Students List :  ");
        System.out.println();
        for (Student st : Students) {
            System.out.println( "Name: " + st.getFirstName() + " " + st.getLastName() + " Grade: " + st.getGrade() + " Student Number: " + st.getNumber());
        }
        System.out.println();
    }
}