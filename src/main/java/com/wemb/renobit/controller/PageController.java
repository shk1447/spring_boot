package com.wemb.renobit.controller;

import java.util.*;

import com.wemb.renobit.entity.Page;
import com.wemb.renobit.service.PageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/page")
@Api(value="Page Controller", description = "Super Page Api")
public class PageController {

    @Autowired
    private PageService PageService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation(value="Page", notes="response Page list")
    List<Page> getPageList() {
        return PageService.GetPageList();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ApiOperation(value="Page", notes="response Page list")
    Page savePage(@RequestBody Page page) {
        return PageService.savePage(page);
    }

    @RequestMapping(value = "/del", method = RequestMethod.POST)
    @ApiOperation(value="Page", notes="response Page list")
    boolean delPage(@RequestBody String pageId) {
        return PageService.delPage(pageId);
    }
}