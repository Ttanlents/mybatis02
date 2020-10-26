package com.yjf.entity;

/**
 * @author 余俊锋
 * @date 2020/10/9 11:48
 * @Description
 */
public class Course {

    private Integer courseId;
    private Integer stuId;
    private String courseName;
    private String courseNum;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }
}
