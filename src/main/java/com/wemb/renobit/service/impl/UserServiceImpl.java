package com.wemb.renobit.service.impl;

import java.util.*;

import com.google.common.collect.ImmutableList;
import com.wemb.renobit.entity.User;
import com.wemb.renobit.repository.UserRepository;
import com.wemb.renobit.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional(readOnly = true, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public List<User> GetUserList() {
        return userRepository.findAll();
    }
}