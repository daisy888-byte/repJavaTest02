package com.bjpn.dao;

import com.bjpn.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectByName(String name);
    Integer deleteById(Integer id);
}
