package com.jnshu.service;

import com.jnshu.dao.StudentDao;
import com.jnshu.pojo.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by PC on 2017/7/31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml",  })
public class StudentServiceTest {
    @Autowired
    private StudentDao studentDao;
    @Test
    public void getAllStudent() throws Exception {
        List<Student> studentList = studentDao.getAllStudent();
        System.out.println("studentList=" + studentList.toString() );
    }

}