package com.Future.service;

import com.Future.controller.StudentController;
import com.Future.dao.MachineLearningRepository;
import com.Future.entity.MachineLearning;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MachineLearningService {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Resource
    private MachineLearningRepository machineLearningRepository;

    public List<MachineLearning> getMachineLearningContents() {
        logger.info("从数据库读取关于机器学习的文章内容");
        return this.machineLearningRepository.getMachineLearningContents();
    }

}
