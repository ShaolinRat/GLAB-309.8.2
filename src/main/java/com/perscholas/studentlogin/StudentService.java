package com.perscholas.studentlogin;

import java.util.List;

public interface StudentService {
   void saveStudent(StudentDto studentDto);
   Student findStudentByEmail(String email);
   List<StudentDto> findAllStudents();
}
