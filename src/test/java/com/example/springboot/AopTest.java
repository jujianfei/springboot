package com.example.springboot;

import com.example.springboot.service.TargetClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author JuJianFei
 * @date 2018/11/14 11:26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AopTest {

    @Autowired
    private TargetClass timeUtil;

    @Test
    public void test(){
        timeUtil.testAop();
    }

}
