package com.Future.controller;


import com.Future.entity.MachineLearning;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.Future.service.MachineLearningService;

import java.util.List;

@RestController
@RequestMapping("/machine_learning")
public class MachineLearningController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private MachineLearningService machineLearningService;


    @RequestMapping("/all_content")
    @ResponseBody
    public List<MachineLearning> getMachineLearningContents() {
        return machineLearningService.getMachineLearningContents();
    }







}
