package cn.abel;

import cn.abel.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@TestPropertySource("/application.properties")
public class BaseTest {
    @Autowired
    private UserDao userDao;

    @Configuration
    @ComponentScan(basePackages = {"cn.abel"}, excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class))
    static class ComponentScanConfig {

    }


    @Test
    public void contextLoads() {
        int result = userDao.abc();
        System.out.println(result);
    }

}