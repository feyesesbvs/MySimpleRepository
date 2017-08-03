package com.jnshu.controller;

import com.jnshu.pojo.Student;
import com.jnshu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PC on 2017/7/31.
 */
@Controller
public class Demo1Controller {

    @Autowired
    private StudentService studentService;

//                 查询学员信息页面
    @RequestMapping(value="/getAllStu",method = RequestMethod.GET)
    public  String demo1View(Model model){
        List<Student> studentList = studentService.getAllStudent();
        model.addAttribute( "studentList",studentList );
        return "getAllStu";
           }


    //       根据ID查询用户
    @RequestMapping(value = "/getStu",method = RequestMethod.GET)
    public String findById(@PathVariable(value = "id") Long id,Model model){
        Student student =studentService.findById( id );
        List<Student> studentList = new ArrayList <Student>(  );
        studentList.add( student );
        model.addAttribute( "studentList",studentList);
        return "getStu";
    }

           //                         添加学员信息页面
    @RequestMapping(value = "/addStu",method =RequestMethod.GET)
     public String addStudent(Model model){
        Student student = new Student(  );
        model.addAttribute( "student", student );
        return "addStu";
     }
//                       添加成功后返回成功信息
    @RequestMapping(value ="/success",method =RequestMethod.POST)
    public String success(@ModelAttribute Student student){
        studentService.addStudent( student );
        return "success";
    }


//           修改学员信息页面
    @RequestMapping(value = "/updateStu/{id}",method = RequestMethod.GET)
    public String updateStudent(@PathVariable(value = "id") Long id, Model model){
        Student student = studentService.findById( id );
        model.addAttribute( "student", student);
        System.out.println( "BBBBBBBBBBBBBBB"+student.getId() );
        return "updateStu";
    }
//           点击提交编辑,返回成功页面
    @RequestMapping(value = "/success2",method = RequestMethod.POST)
    public String updateSuccess(@ModelAttribute Student student){
        System.out.println( "AAAAAAAAAAAAAAAAAAA"+student.getId() );
        studentService.updateStudent( student );
        return "success2";
    }
//                        根据ID删除学员信息
    @RequestMapping(value = "/deleteStu/{id}",method = RequestMethod.GET)
    public String delete(@PathVariable(value = "id") long id){
        studentService.deleteById( id );
        return "success";
    }

}

