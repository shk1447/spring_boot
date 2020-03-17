package com.wemb.renobit.service.impl;

import java.util.*;

import com.wemb.renobit.entity.Page;
import com.wemb.renobit.repository.PageRepository;
import com.wemb.renobit.service.PageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PageServiceImpl implements PageService {

    @Autowired
    PageRepository pageRepository;

    @Override
    @Transactional(readOnly = true, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public List<Page> GetPageList() {
        return pageRepository.findAll();
    }

    @Override
    public Page savePage(Page page) {
        return pageRepository.save(page);
    }

    @Override
    public boolean delPage(String pageId) {
        boolean ret = true;
        Page aaa = new Page(pageId, "ttt");
    
        try {
            pageRepository.delete(aaa);
        } catch (Exception e) {
            //TODO: handle exception
            ret = false;
        }

        return ret;
    }
}