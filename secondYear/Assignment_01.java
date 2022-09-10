package secondYear;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

class Course {
    // instance variables
    public String name;
    public String faculty;
    public String dean;
    public String courseAdmin;
    public float cost;
    public ArrayList<String> enrollmedStudents = new ArrayList<>();
    public int capacity = 80;
    // class variables
    public static double courseRegistrationCost = 1_000.00;
    public static double courseDropOutFee = 2_000.00;
    // local variable
    private double additionalCourseFees = 2_000.00;
    private boolean available;

    public Course(String name, String faculty,
            String dean, String courseAdmin,
            float cost) {
        this.name = name;
        this.faculty = faculty;
        this.dean = dean;
        this.courseAdmin = courseAdmin;
        this.cost = cost;
    }

    public void addStudent(Student student) {
        if (this.capacity < 80) {
            enrollmedStudents.add(student.firstName);
            this.capacity += 1;
        } else {
            System.out.print("Course capacity filled");
        }
    }

    public void dropStudent(Student student) {

    }

    public boolean GetFieldAvailability() {
        return this.available;
    }

    public void setAvailability(boolean available) {
        this.available = available;
    }

    public int getOccupancy() {
        return this.enrollmedStudents.size();
    }

}

class Student {
    // instance variables
    public String firstName;
    public String lastName;
    public String surname;
    public int age;
    public String DOB;
    public String idNumber;
    // class variables
    public static String country = "Kenya";
    public static String city = "Nairobi";
    // local variables
    private double tuitionTax = 5.0;
    private double foriegnStudentRegristrationFee = 20_000.0;

    public Student(String firstName, String lastName,
            String surname, int age,
            String DOB, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surname = surname;
        this.age = age;
        this.DOB = DOB;
        this.idNumber = idNumber;
    }

    public void payFee(float feeAmount) {
        // fee payment implementation goes here
    }

    public void enroll(Course course) {
        course.addStudent(this);
    }

    public void dropout(Course course) {
        course.dropStudent(this);
    }

    public void requestSpecialExam() {
        // the implementation on how to request special exam goes in here
    }
}

class Teacher {
    // instance variable
    public String firstName;
    public String lastName;
    public String surname;
    public String DOB;
    public String faculty;
    // class variables
    public static String university = "Strathmore";
    public static String city = "Nairobi";
    // local variables
    private double teacherPensionRate = 0.4;
    private double taxRate = 10.0;

    public Teacher(String fistName, String lastName, String surname, String DOB, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surname = surname;
        this.DOB = DOB;
        this.faculty = faculty;

    }

    public void enroll(Course course) {
        // enrollment of teacher into a course happens here
    }

    public void recordAttendance() {
        // record student attendance happens here
    }

    public void recordStudentAttendace() {
        // record student attendance logic goes here
    }

    public void postAssignment() {
        // assignment posting logic goes in here
    }

    public void uploadNotes() {
        // upload notes logic goes in here
    }

    public void issueMakeUpCat() {
        // issue makeup cats logic goes in here
    }

}

class DeanOfStudent extends Teacher {

    public DeanOfStudent(String fistName, String lastName, String surname, String DOB, String faculty) {
        super(fistName, lastName, surname, DOB, faculty);
        // TODO Auto-generated constructor stub
    }
}

class HeadOfForeignStudent extends Teacher {

    public HeadOfForeignStudent(String fistName, String lastName, String surname, String DOB, String faculty) {
        super(fistName, lastName, surname, DOB, faculty);
        // TODO Auto-generated constructor stub
    }
}

public class Assignment_01 {
    public static void main(String[] args) {
        Student brain = new Student("Brian", "Doe", "Kilwa", 20, "20/9/2002", "13468");
        Student janStudent = new Student("Janet", "Doe", "Kilwa", 18, "20/9/2004", "13690");

        Teacher Lucy = new Teacher("Lucy", "Doe", "Kilwa", "29/10/1989", "Business");
        Teacher john = new Teacher("John", "Doe", "Kilwa", "22/08/1990", "Computing and mathematica sciences");

        Course english = new Course("English", "Language", "John", "Tommy", 20_000);
        Course computerScient = new Course("Computer Science", "Computing", "John", "Tommy", 1_000_000);


        // creating object for two sub classes
        DeanOfStudent deanOfStudent = new DeanOfStudent("fistName", "lastName", "surname", "DOB", "faculty");
        HeadOfForeignStudent dHeadOfForeignStudent = new HeadOfForeignStudent("fistName", "lastName", "surname", "DOB", "faculty");

    }
}