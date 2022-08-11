package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {

    /*
    Course name
    Professor
    Students
     */

    private String courseName;
    private Teacher professor;
    private HashMap<String, Integer> students;

    public HashMap<String, Integer> addStudent(Student student) {
        HashMap<String, Integer> studentHash = new HashMap<>();
        String studentName = student.getName();
        Integer studentId = student.getStudentId();
        studentHash.put(studentName, studentId);
        return studentHash;
    }

}
