package com.example.springboot.service;

import org.springframework.stereotype.Component;

/**
 * 
 * @author jujianfei
 * @since 2018年10月19日
 */
@Component
public class TargetClass {

    public void testAop(){
	    try{
            Thread.sleep(3000);
        }catch (Exception ignored) {

        }
    }
}
