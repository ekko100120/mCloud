package com.mercury.controller;


import com.mercury.entity.Company;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest")
public class HelloController {
    @Autowired
    private Company company;

    private final  static Logger logger = LoggerFactory.getLogger(HelloController.class);


    @RequestMapping("/company")
    @ResponseBody
    public Company getCompany(){
        
        logger.info("comany message: {}",company);
        return  company;
    }
}
