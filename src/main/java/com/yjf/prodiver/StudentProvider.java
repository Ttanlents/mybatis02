package com.yjf.prodiver;

import com.yjf.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * @author 余俊锋
 * @date 2020/10/10 15:11
 * @Description
 */
public class StudentProvider {

    public String batchInsert(Map<String, List<Student>> map) {
        List<Student> list = map.get("list");
        StringBuilder sql = new StringBuilder("insert into student values");
        for (int i = 0; i < list.size(); i++) {
            sql.append(" (null,#{list[" + i + "].stuName},#{list[" + i + "].stuAge},#{list[" + i + "].stuPassword})");
            if (i < list.size() - 1) {
                sql.append(",");
            }
        }
        return sql.toString();
    }

    public String update(Student student) {
        StringBuilder sql = new StringBuilder("update student set");
        if (student.getStuName() != null) {
            sql.append(" stu_name=#{stuName},");
        }
        if (student.getStuAge() != null) {
            sql.append("stu_age=#{stuAge},");
        }
        if (student.getStuPassword() != null) {
            sql.append("stu_password=#{stuPassword},");
        }
        sql.deleteCharAt(sql.length() - 1);
        sql.append("  where stu_id=#{stuId}");
        return sql.toString();
    }

    public String delete(Map<String, List<Integer>> map) {
        List<Integer> list = map.get("list");
        StringBuilder sql = new StringBuilder(" delete from student where stu_id in (");
        for (int i = 0; i < list.size(); i++) {
            sql.append("#{list[" + i + "]}");
            if (i < list.size() - 1) {
                sql.append(",");
            }
        }
        sql.append(")");

        return sql.toString();
    }

    public String select(Map<String, Object> map) {
        String name = (String) map.get("name");
        Integer start = (Integer) map.get("start");
        Integer end = (Integer) map.get("end");
        StringBuilder sql = new StringBuilder("select  stu_id,stu_name,stu_age,stu_password from student where 1=1");
        if (name != null) {
            sql.append(" and stu_name like concat('%',#{name},'%')");
        }
        if (start != null) {
            sql.append(" and stu_age&gt;=#{start}");
        }
        if (end != null) {
            sql.append("and stu_age&lt;=#{end}");
        }
        return sql.toString();
    }
}
