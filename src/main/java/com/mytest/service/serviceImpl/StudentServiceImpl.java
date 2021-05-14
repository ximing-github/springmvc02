package com.mytest.service.serviceImpl;

import com.mytest.beans.Student;
import com.mytest.dao.StudentDao;
import com.mytest.service.StudentService;

import java.util.List;

/**
 * ClassName:StudentServiceImpl
 * Package: com.mytest.service.serviceImpl
 * Description:
 *
 * @Date: 2021/5/13 11:10
 * @Author: 惜名
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<Student> queryStudent() {
        List<Student> students = studentDao.selectAllStudent();
        return students;
    }

    @Override
    public Student queryStudnetByName(String name) {
        Student student = studentDao.selectOneStudent(name);
        return student;
    }

    @Override
    public int addStudent(Student student) {
        int num = studentDao.insertStudent(student);
        return num;
    }
}
