package com.jnshu.service;

import com.jnshu.dao.StudentDao;
import com.jnshu.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 2017/7/31.
 */
@Service
@Configuration
@Transactional
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    private Student student;
    private long id;

    public List <Student> getAllStudent() {
        List <Student> studentList = new ArrayList <Student>( );
        studentList = studentDao.getAllStudent( );
        return studentList;
    }

    public Student findById(long id){
        Student student = studentDao.findById(id);
        return student;
    }


    public void addStudent(Student student) {
        studentDao.addStudent( student );
    }



    public void deleteById(long id) {
        studentDao.deleteById( id );
    }

    public void updateStudent(Student student){
        studentDao.update( student );
    }
}
