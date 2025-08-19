import java.util.ArrayList;
import java.util.List;


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


class Student extends Person {
    private int studentId;
    private List<Course> courses;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }

    public void displayCourses() {
        System.out.println("Courses enrolled by " + getName() + ":");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}


class Course {
    private String courseName;
    private String courseCode;

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }
}


class College {
    private String collegeName;
    private List<Student> students;
    private List<Course> courses;

    public College(String collegeName) {
        this.collegeName = collegeName;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void showAllStudents() {
        System.out.println("Students in " + collegeName + ":");
        for (Student s : students) {
            System.out.println("ID: " + s.getStudentId() + ", Name: " + s.getName() + ", Age: " + s.getAge());
        }
    }

    public void showAllCourses() {
        System.out.println("Courses offered by " + collegeName + ":");
        for (Course c : courses) {
            System.out.println(c.getCourseCode() + ": " + c.getCourseName());
        }
    }
}


public class CollegeManagementSystem {
    public static void main(String[] args) {
        
        College myCollege = new College("AITS college");

        
        Course math = new Course("Mathematics", "MATH101");
        Course physics = new Course("Physics", "PHY101");
        Course compSci = new Course("Computer Science", "CS101");

       
        myCollege.addCourse(math);
        myCollege.addCourse(physics);
        myCollege.addCourse(compSci);

        
        Student s1 = new Student("hari", 20, 3030);
        Student s2 = new Student("harinath", 21, 3031);

        
        myCollege.addStudent(s1);
        myCollege.addStudent(s2);

        
        s1.enrollCourse(math);
        s1.enrollCourse(compSci);

        s2.enrollCourse(physics);

       
        myCollege.showAllStudents();
        System.out.println();

        myCollege.showAllCourses();
        System.out.println();

        s1.displayCourses();
        System.out.println();
        s2.displayCourses();
    }
}
