package com.bjpn.service;

import com.bjpn.domain.Student;

import java.util.List;

public interface StudentService {
    List<Student> searchStudents(String firstname);
    Integer removeStudent(Integer schoolNo);
}
