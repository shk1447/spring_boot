package com.wemb.renobit.controller;

import com.wemb.renobit.entity.TestEntity;
import com.wemb.renobit.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/page/get", method = RequestMethod.GET)
    public String getTest() {
        return testService.GetData();
    }

    @RequestMapping(value = "/page/set", method = RequestMethod.POST)
    public String setTest() {
        return testService.SetData();
    }

    public TestController() {
        System.out.println("controller");
        System.out.println(testService);
    }
}