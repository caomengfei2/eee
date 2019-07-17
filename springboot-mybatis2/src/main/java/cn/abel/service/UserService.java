package cn.abel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.abel.dao.UserDao;

@Service
public class UserService {
    @Autowired
	private UserDao userDao;
	

    
}