package com.mytest.beans;

/**
 * ClassName:Student
 * Package: com.mytest.beans
 * Description:
 *
 * @Date: 2021/5/13 10:54
 * @Author: 惜名
 */
public class Student {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
