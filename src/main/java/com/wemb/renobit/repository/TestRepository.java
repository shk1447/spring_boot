package com.wemb.renobit.repository;

import com.wemb.renobit.entity.TestEntity;

// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<TestEntity, Long> {

}