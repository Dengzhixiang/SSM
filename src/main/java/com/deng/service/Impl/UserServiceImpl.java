package com.deng.service.Impl;

import com.deng.dao.UserDao;
import com.deng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
}
