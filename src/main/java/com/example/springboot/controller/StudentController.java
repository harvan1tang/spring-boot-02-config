package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Title: StudentController
 * @Description: com.example.springboot.controller
 * @Auther: www.example.com
 * @Version: 1.0
 */
@Controller
public class StudentController {

    @Value("${student.last-name}")
    private String name;

    @ResponseBody
    @RequestMapping("/say")
    public String sayHello() {
        return "say hello " + name;
    }
    @RequestMapping(value = "/helloWorld",method = RequestMethod.POST)
    public String helloWorld(Model model, HttpServletRequest request, HttpSession session){
        model.addAttribute("message","Hello World");
        return "helloWorld";
    }

}
