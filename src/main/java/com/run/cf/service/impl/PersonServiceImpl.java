package com.run.cf.service.impl;

import com.run.cf.dao.mapper.PersonMapper;
import com.run.cf.dao.model.Person;
import com.run.cf.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author : hewei
 * @date : 2018/3/30
 */
@Service
public class PersonServiceImpl implements IPersonService {

    @Resource
    private PersonMapper personMapper;

    @Override
    public Person getPerson(String id) {
        Person person = personMapper.selectByPrimaryKey(id);
        return person;
    }
}
