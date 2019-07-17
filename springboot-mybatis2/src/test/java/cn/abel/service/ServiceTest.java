package cn.abel.service;

import cn.abel.BaseTest;
import cn.abel.dao.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceTest extends BaseTest {


    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;

    @Test
    public void dynamicDataSourceTest(){
        int result = userDao.abc();
        System.out.println(result);

    }
}
