package com.wemb.renobit.repository;

import java.util.List;

import com.wemb.renobit.entity.Page;

// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PageRepository extends CrudRepository<Page, Long> {
    @Override
    List<Page> findAll();
}