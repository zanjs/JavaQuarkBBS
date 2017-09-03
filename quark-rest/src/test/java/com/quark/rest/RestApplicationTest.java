package com.quark.rest;

import com.quark.common.dao.AdminUserDao;
import com.quark.common.dao.PostsDao;
import com.quark.rest.service.PostsService;
import com.quark.rest.service.RedisService;
import com.quark.rest.service.ReplyService;
import com.quark.rest.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * Created by lhr on 17-7-31.
 * user.setUsername("lhr");
 * user.setPassword("root");
 */
@RunWith(SpringRunner.class)
@TestPropertySource(locations = {"classpath:rest.properties"})
@SpringBootTest
public class RestApplicationTest {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    UserService userService;

    @Autowired
    DataSource dataSource;

    @Autowired
    PostsService postsService;

    @Autowired
    ReplyService replyService;

    @Autowired
    AdminUserDao dao;

    @Autowired
    RedisService redisService;

    @Autowired
    PostsDao postsDao;
    @Test
    public void testDataSource() {
        userService.updateUserPassword("2a8e48c8-9d09-4ef4-892c-b3436070297c","12345678","123456");
    }

}
