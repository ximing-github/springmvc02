package com.mytest.dao;

import com.mytest.beans.Student;

import java.util.List;

/**
 * ClassName:StudentDao
 * Package: com.mytest.dao
 * Description:
 *
 * @Date: 2021/5/13 11:13
 * @Author: 惜名
 */
public interface StudentDao {
    List<Student> selectAllStudent();
    Student selectOneStudent(String name);
    int insertStudent(Student student);
}
