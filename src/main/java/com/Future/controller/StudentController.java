package com.Future.controller;


import com.Future.entity.Student;
import com.Future.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stu")
public class StudentController {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentService studentService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Student> getStus(){
        logger.info("从数据库读取Student集合");
        return studentService.getList();
    }

    @RequestMapping("/student_name")
    @ResponseBody
    public List<Student> getStudentInfo(@RequestParam("id") String id) {
        logger.info("从数据库读取id为："+ id +"的Student集合");
        return studentService.getStudentInfo(Integer.valueOf(id));
    }

}
