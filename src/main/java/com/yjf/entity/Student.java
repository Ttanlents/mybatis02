package com.yjf.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 余俊锋
 * @date 2020/10/9 11:48
 * @Description
 */
public class Student implements Serializable {
    private Integer stuId;
    private String stuName;
    private Integer stuAge;
    private String stuPassword;
    private Address address;
    private List<Course> courses;

    public Student() {
    }

    public Student(Integer stuId, String stuName, Integer stuAge, String stuPassword) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuPassword = stuPassword;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuPassword='" + stuPassword + '\'' +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }
}
