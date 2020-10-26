package com.yjf.dao;

import com.yjf.entity.Course;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 余俊锋
 * @date 2020/10/10 18:19
 * @Description
 */
public interface CourseDao {
    /*@Select(value = "select * from course where stu_id=#{stuId}")*/
    List<Course> getCourseByStuId(Integer stuId);
}
