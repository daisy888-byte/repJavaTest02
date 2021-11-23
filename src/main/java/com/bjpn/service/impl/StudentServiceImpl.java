package com.bjpn.service.impl;

import com.bjpn.dao.StudentDao;
import com.bjpn.domain.Student;
import com.bjpn.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;

    @Override
    public List<Student> searchStudents(String firstname) {

        return studentDao.selectByName(firstname);
    }

    @Override
    public Integer removeStudent(Integer schoolNo) {
        return studentDao.deleteById(schoolNo);
    }
}
