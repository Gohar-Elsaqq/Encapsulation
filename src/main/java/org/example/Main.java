package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Gohar", 1, 21);
        Student student2 = new Student("Adham", 2, 22);
        Student student3 = new Student("Sara", 3, 20);
        Student student4 = new Student("Omar", 4, 23);

        // Creating Course objects
        Course course1 = new Course("Computer Science", "CS101");
        Course course2 = new Course("Mathematics", "MATH101");

        // Adding students to the courses
        course1.addStudent(student1);
        course1.addStudent(student2);

        course2.addStudent(student3);
        course2.addStudent(student4);

        // Creating a list of courses
        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        
        for (Course course : courses) {
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Course Code: " + course.getCourseCode());
            System.out.println("Enrolled Students:");
            for (Student student : course.getStudents()) {
                System.out.println("    Name: " + student.getName() + ", ID: " + student.getId() + ", Age: " + student.getAge());
            }
            System.out.println(); 
        }
    }
}
