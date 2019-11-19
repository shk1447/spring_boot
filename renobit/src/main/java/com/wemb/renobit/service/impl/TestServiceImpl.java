package com.wemb.renobit.service.impl;

import java.util.Map;

import com.wemb.renobit.entity.TestEntity;
import com.wemb.renobit.repository.TestRepository;
import com.wemb.renobit.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestRepository testRepository;

    @Override
    public String GetData() {
        long tt = testRepository.count();
        
        
        System.out.println(tt);
        return "test";
    }

    @Override
    public String SetData() {
        long tt = testRepository.count();
        
        System.out.println(tt);
        return "test2";
    }

    public TestServiceImpl() {
        System.out.println("service init");
    }

}