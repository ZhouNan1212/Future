package com.Future.service;


import com.Future.controller.StudentController;
import com.Future.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class StudentService {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> getList(){
        String sql = "SELECT ID,NAME,SCORE_SUM,SCORE_AVG, AGE FROM student";
        return (List<Student>) jdbcTemplate.query(sql, new RowMapper<Student>(){

            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student stu = new Student();
                stu.setId(rs.getInt("id"));
                stu.setAge(rs.getInt("age"));
                stu.setName(rs.getString("name"));
                stu.setSumScore(rs.getString("score_sum"));
                stu.setAvgScore(rs.getString("score_avg"));
                return stu;
            }

        });
    }

    public List<Student> getStudentInfo(int id) {
        String sql = "select ID,NAME,SCORE_SUM,SCORE_AVG, AGE from student where id = " + id;
        logger.info("sql查询语句为：" + sql);
        return (List<Student>) jdbcTemplate.query(sql, new RowMapper<Student>(){

            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student stu = new Student();
                stu.setId(rs.getInt("id"));
                stu.setAge(rs.getInt("age"));
                stu.setName(rs.getString("name"));
                stu.setSumScore(rs.getString("score_sum"));
                stu.setAvgScore(rs.getString("score_avg"));
                return stu;
            }

        });
    }

}
