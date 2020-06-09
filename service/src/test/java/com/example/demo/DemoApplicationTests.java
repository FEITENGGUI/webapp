package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    public static  void main(String[] args){
        HashMap<String,String> hostMap= new HashMap<>();
        hostMap.put(null,null);
    }
}
