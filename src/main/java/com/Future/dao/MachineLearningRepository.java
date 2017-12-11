package com.Future.dao;

import com.Future.controller.StudentController;
import com.Future.entity.MachineLearning;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MachineLearningRepository {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<MachineLearning> getMachineLearningContents() {
        logger.info("标记");
        String sql = "select id, title, label, content from machine_learning";
        logger.info("sql"+sql);
        return (List<MachineLearning>) jdbcTemplate.query(sql, new RowMapper<MachineLearning>() {

            @Override
            public MachineLearning mapRow(ResultSet rs, int rowNum) throws SQLException {
                MachineLearning machineLearning = new MachineLearning();
                machineLearning.setId(rs.getInt("id"));
                machineLearning.setLabel(rs.getString("label"));
                machineLearning.setTitle(rs.getString("title"));
                machineLearning.setContent(rs.getString("content"));
                return machineLearning;
            }
        });
    }
}
