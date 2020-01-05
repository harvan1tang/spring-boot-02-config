package com.example.springboot;

import com.example.springboot.bean.Student;
import com.example.springboot.service.StudentService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {
    //被动，依赖注入,控制反转，AOP
    @Autowired
    Student student;
    @Autowired
    Student student1;
    //@Resource
    //Student student1;
    @Autowired
    StudentService studentService;
    @Autowired
    ApplicationContext context;

    @Test
    public void testXml() {
        StudentService studentService = (StudentService)context.getBean("studentService");
        System.out.println("studentService: " + studentService);
        studentService.add();
    }
    //注入
    @Value("${name}")
    protected  String name;

    @Value("#{10*12}")
    private Integer age;

    @Test
    public void contextLoads() {
//        主动
//        Student student = new Student()
        System.out.println(age);
        System.out.println(student);
        System.out.println(student1);
        studentService.add();
    }

}
