package com.mytest.controller;


import com.mytest.beans.Student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


/**
 * ClassName:MyController
 * Package: com.mytest.controller
 * Description:
 *
 * @Date: 2021/5/12 20:56
 * @Author: 惜名
 */
@Controller
public class MyController {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","welcome");
        mv.setViewName("student");


        return mv;
    }
   /* @RequestMapping(value = "/addStudent.do" ,method = RequestMethod.POST)
    //接收参数的方式（逐个接收）
    public ModelAndView test(String name,Integer age){

        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.setViewName("hello");
        return mv;
    }*/
   /* @RequestMapping(value = "/addStudent.do" ,method = RequestMethod.POST)
    //接收参数的方式（封装成对象接收）
    public ModelAndView test(Student student){

        ModelAndView mv = new ModelAndView();
        mv.addObject("student",student);
       // mv.addObject("age",age);
        mv.setViewName("hello");
        return mv;
    }*/
   /* //返回值类型为String（只返回view）
   @RequestMapping(value = "/addStudent.do" ,method = RequestMethod.POST)
    public  String test(){
        return "hello";
    }*/
   //返回值类型为object-->自定义实体类（只返回view）
   /*@RequestMapping(value = "/ajax.do" )
   @ResponseBody
   public Student test(Student student) {
       //List<Student> list = new ArrayList<>();
    *//*Student student= new Student();
    student.setAge(age);
    student.setName(name);*//*
    //list.add(student);
       return student;


   }*/
   @RequestMapping(value = "/ajax.do" ,produces = "text/plain;charset=utf-8")
   @ResponseBody
    public String test(Student student) {


       return student.getName();
      // return  "111";
       //return  "abc";


    }
}
