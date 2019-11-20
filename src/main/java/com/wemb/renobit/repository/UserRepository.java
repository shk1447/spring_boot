package com.wemb.renobit.repository;

import java.util.List;

import com.wemb.renobit.entity.User;

// import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    @Override
    List<User> findAll();
}