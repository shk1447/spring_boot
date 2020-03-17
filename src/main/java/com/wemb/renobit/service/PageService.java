package com.wemb.renobit.service;

import java.util.*;

import com.wemb.renobit.entity.Page;

public interface PageService {
    public List<Page> GetPageList();

	public Page savePage(Page page);

	public boolean delPage(String pageId);
}