
package com.student;

public class StudentManagerTest {

    public void testAddStudent() {
        StudentManager manager = new StudentManager();

        assertTrue(manager.addStudent(new Student(1, "Rahul", "Computer Science")));
        assertEquals(1, manager.students.size());
    }

    public void testSearchAndDeleteStudent() {
        StudentManager manager = new StudentManager();
        Student student = new Student(2, "Priya", "Mathematics");

        manager.addStudent(student);

        Student found = manager.searchStudent(2);
        assertNotNull(found);
        assertEquals(student, found);

        assertTrue(manager.deleteStudent(2));
        assertEquals(0, manager.students.size());
        assertNull(manager.searchStudent(2));
    }

    public static void main(String[] args) {
        StudentManagerTest tests = new StudentManagerTest();
        tests.testAddStudent();
        tests.testSearchAndDeleteStudent();
    }

    private static void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private static void assertEquals(Object expected, Object actual) {
        if (expected == null ? actual != null : !expected.equals(actual)) {
            throw new AssertionError("Expected " + expected + " but was " + actual);
        }
    }

    private static void assertNotNull(Object value) {
        if (value == null) {
            throw new AssertionError("Expected a non-null value");
        }
    }

    private static void assertNull(Object value) {
        if (value != null) {
            throw new AssertionError("Expected null but was " + value);
        }
    }
}
