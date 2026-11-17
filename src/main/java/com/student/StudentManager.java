
package com.student;

import java.util.ArrayList;

public class StudentManager {

    public ArrayList<Student> students = new ArrayList<>();

    public boolean addStudent(Student s) {
        if (s == null) {
            System.out.println("Student cannot be null.");
            return false;
        }

        students.add(s);
        System.out.println("Student added successfully!");
        return true;
    }

    public void displayStudents() {
        for (Student s : students) {
            s.display();
        }
    }

    public Student searchStudent(int id) {
        for (Student s : students) {
            if (s.id == id) {
                s.display();
                return s;
            }
        }

        System.out.println("Student not found.");
        return null;
    }

    public boolean deleteStudent(int id) {
        boolean removed = students.removeIf(s -> s.id == id);

        if (removed) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }

        return removed;
    }
}
