package com.perscholas.studentlogin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>
{
 
  Student findByEmail(String email);
}

