package com.mytest.service;

import com.mytest.beans.Student;

import java.util.List;

/**
 * ClassName:StudentService
 * Package: com.mytest.service
 * Description:
 *
 * @Date: 2021/5/13 11:07
 * @Author: 惜名
 */
public interface StudentService {
    List<Student> queryStudent();
    Student queryStudnetByName(String name);
    int addStudent(Student student);
}
