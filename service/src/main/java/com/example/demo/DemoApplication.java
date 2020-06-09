package com.example.demo;

import com.example.demo.entity.Apple;
import com.example.demo.entity.Banana;
import com.example.demo.entity.Fruit;
import com.example.demo.model.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

//    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
//    }
    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
//        Test<? extends Fruit> test=new Test<Apple>(new Apple());
        Test<Apple> test=new Test<Apple>(new Apple());
        Class<Test> testClass = Test.class;
        Class<Apple> appleClass = Apple.class;

        List list=new ArrayList<>();
        list.add(new Fruit());
        list.add(new Apple());
        list.add(new Banana());
        list.add(1);
        list.add("aaa");
        System.out.println(list.toString());

//        System.out.println(test.getT().toString());
    }
}
