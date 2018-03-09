package tech.hongjian.aspectj_demo;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

import tech.hongjian.aop_for_thirdjar.entity.User;

public class AppTest {  
      
	@Test
    public void test(){  
        User u = new User(1, "hello");  
        System.out.println(JSON.toJSONString(u));
    }  
}  
