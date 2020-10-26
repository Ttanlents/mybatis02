package com.yjf.dao;

import com.yjf.entity.Student;
import com.yjf.prodiver.StudentProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 余俊锋
 * @date 2020/10/10 10:46
 * @Description
 */
public interface StudentDao {

    /*注解方式*/
    //  @InsertProvider(type = StudentProvider.class,method = "batchInsert")
    void insert(List<Student> list);


    //@DeleteProvider(type = StudentProvider.class,method = "delete")
    void delete(List<Integer> list);

    // @UpdateProvider(type = StudentProvider.class,method = "update")
    void update(Student student);

    //  @SelectProvider(type = StudentProvider.class,method = "select")
    List<Student> selectByNameAndAge(@Param("name") String name, @Param("start") Integer start, @Param("end") Integer end);


    // @Result(id = true,property = "id",column = "id"),
  /* @Select(value = "select * from student ")
    @Results(value = {@Result(column = "address_id",property = "address",one =@One(select = "com.yjf.dao.AddressDao.getAddressById")),
            @Result(column ="stu_id",property = "courses",many = @Many(select = "com.yjf.dao.CourseDao.getCourseByStuId"))})*/
    List<Student> listAll();
}
