package cn.abel.controller;

import cn.abel.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/count")
    @ResponseBody
    public int abc(){
        return userDao.abc();

    }

}
