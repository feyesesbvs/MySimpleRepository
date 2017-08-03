package com.jnshu.dao;

import com.jnshu.pojo.Student;

import java.util.List;

/**
 * Created by PC on 2017/7/31.
 */
public interface StudentDao {
//   查询所有列表
   List<Student> getAllStudent();
//    根据ID查询用户
   Student findById(long id);
//     添加用户
void addStudent(Student student);
//         根据ID删除用户
    void  deleteById(long id);
//       修改用户
   void update(Student student);



}

