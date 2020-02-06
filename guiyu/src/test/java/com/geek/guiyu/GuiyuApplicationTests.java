package com.geek.guiyu;

import com.geek.guiyu.service.util.ShortMessageUtil;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GuiyuApplicationTests {
    @Autowired
    ShortMessageUtil shortMessageUtil;
    @Test
    public void test() {
        shortMessageUtil.sendShortMessage("13370730939");
    }
    @Test
    public void testrandom(){
        double random = Math.random() * 1000000;
        System.out.println(String.valueOf((int)random));
    }

}
