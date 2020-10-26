package com.yjf.test;

import com.yjf.dao.StudentDao;
import com.yjf.entity.Student;
import com.yjf.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 余俊锋
 * @date 2020/10/10 10:47
 * @Description
 */
public class Demo {
    @Test
    public void insert() {
        SqlSession session = MybatisUtil.getSqlSession();
        StudentDao studentdao = session.getMapper(StudentDao.class);
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(null, "jackAndRose", 22, "123456"));
        list.add(new Student(null, "jackAndRose", 22, "123456"));
        list.add(new Student(null, "jackAndRose", 22, "123456"));
        studentdao.insert(list);
        session.commit();
        session.close();
    }

    @Test
    public void delete() {
        SqlSession session = MybatisUtil.getSqlSession();
        StudentDao studentdao = session.getMapper(StudentDao.class);
        studentdao.delete(Arrays.asList(14, 15, 16));
        session.commit();
        session.close();
    }

    @Test
    public void update() {
        SqlSession session = MybatisUtil.getSqlSession();
        StudentDao studentdao = session.getMapper(StudentDao.class);
        Student student = new Student();
        student.setStuId(2);
        student.setStuName("猪八戒");
        student.setStuPassword("123456");
        studentdao.update(student);
        session.commit();
        session.close();
    }

    @Test
    public void selectByNameAndAge() {
        SqlSessionFactory factory = MybatisUtil.createSqlSessionFactory();
        SqlSession session = factory.openSession();
        StudentDao studentdao = session.getMapper(StudentDao.class);
        studentdao.selectByNameAndAge("七", null, null).stream().forEach((student) -> {
            System.out.println(student);
        });
        session.close();

        SqlSession sqlSession = factory.openSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        dao.selectByNameAndAge("七", null, null).stream().forEach((student) -> {
            System.out.println(student);
        });
        SqlSession sqlSession2 = factory.openSession();
        StudentDao dao2 = sqlSession2.getMapper(StudentDao.class);
        dao2.selectByNameAndAge("七", null, null).stream().forEach((student) -> {
            System.out.println(student);
        });
        System.out.println(session);
        System.out.println(sqlSession);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void listAll() {
        SqlSession session = MybatisUtil.getSqlSession();
        StudentDao studentdao = session.getMapper(StudentDao.class);
        List<Student> list = studentdao.listAll();
        /*list.stream().forEach((n)->{
            System.out.println(n);
        });*/
        session.commit();
        session.close();
    }
}
