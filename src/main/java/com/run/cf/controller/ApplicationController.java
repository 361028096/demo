package com.run.cf.controller;

import com.run.cf.dao.model.Person;
import com.run.cf.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


/**
 * @author : hewei
 * @date : 2018/3/30
 */
@Controller
public class ApplicationController {

    @Resource
    private IPersonService personService;

    @RequestMapping("/test")
    public String test(){
        Person person = personService.getPerson("1");
        System.out.println(person);
        System.out.println("hahahahah");
        return "test";
    }
}
