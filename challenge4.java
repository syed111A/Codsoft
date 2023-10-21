package prac;
import java.util.Scanner;

class CourseDatabase {
    public static void displayAvailableCourses() {
        System.out.println("The following courses are available:");
        System.out.println("Course Code: CS101");
        System.out.println("Course Title: Programming Fundamentals");
        System.out.println("Description: This course is specifically designed to provide a solid foundation for beginners, teaching you the essential principles and concepts of programming.");
        System.out.println("Capacity: 30 students");
        System.out.println("Lectures: Monday and Wednesday, 9:00 AM - 10:30 AM");
        System.out.println("Labs: Thursday, 2:00 PM - 4:00 PM");
        System.out.println("Course Code: CS109");
        System.out.println("Course Title: Introduction to Computer Science");
        System.out.println("Description: This course provides an overview of fundamental concepts in computer science, including programming, algorithms, and data structures. It is designed for beginners with no prior coding experience.");
        System.out.println("Capacity: 60 students");
        System.out.println("Lectures: Thursday and Friday, 12:00 AM - 1:30 AM");
        System.out.println("Labs: Monday, 2:00 PM - 4:00 PM");
    }
}

class StudentDatabase {
    private String name;
    private int id;
    private int registeredCourse;
    private int removedCourse;
    Scanner keyboard = new Scanner(System.in);

    public StudentDatabase() {
        System.out.println("Enter your Name: ");
        name = keyboard.next();
        System.out.println("Enter your ID: ");
        id = keyboard.nextInt();
    }

    public void registerCourse() {
        System.out.println("Enter the course code you want to register (101 or 109): ");
        registeredCourse = keyboard.nextInt();
        System.out.println("You have registered for course " + registeredCourse);
    }

    public void removeCourse() {
        System.out.println("Enter the course code you want to remove (101 or 109), or type 'none': ");
        String input = keyboard.next();
        if (input.equalsIgnoreCase("none")) {
            removedCourse = 0; // Indicate no course removal
        } else {
            removedCourse = Integer.parseInt(input);
            System.out.println("You have removed course " + removedCourse);
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getRegisteredCourse() {
        return registeredCourse;
    }

    public int getRemovedCourse() {
        return removedCourse;
    }
}

public class challenge4 {
    public static void main(String[] args) {
        CourseDatabase.displayAvailableCourses();
        StudentDatabase student = new StudentDatabase();
        student.registerCourse();
        student.removeCourse();

        // You can access student information like name, ID, registered course, and removed course
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Registered Course: " + student.getRegisteredCourse());
        System.out.println("Removed Course: " + student.getRemovedCourse());
    }
}
