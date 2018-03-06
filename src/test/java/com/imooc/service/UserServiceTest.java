package com.imooc.service;

import com.imooc.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void addOne() throws Exception {
        /*User user = new User("test01", 1, 18912345672L, "18912345679@163.com", new Date());

        log.info("user = {}", user.toString());
        userService.addOne(user);
        log.info("user = {}", user.toString());
        */

        for (int i = 20; i < 25; i++) {
            User user = new User("test01", 1, (long) i, "18912345679@163.com", new Date());
            userService.addOne(user);
        }
    }

    @Test
    public void findById() throws Exception {

        for (int i = 10; i < 13; i++) {
            User user = userService.findById((long) i);
            log.info("user = {}", user == null ? null : user.toString());
        }

        /*log.info(userService.findById(1L).toString());
        log.info(userService.findById(2L).toString());
        log.info(userService.findById(3L).toString());
        */
    }

}