package com.example.demo.model;

import com.example.demo.entity.Fruit;

import java.util.ArrayList;
import java.util.List;

public class Test <T>{
    private T t;

    public T getT() {
        return t;
    }

    public Test(T t){
        this.setT(t);
    }

    public Test<T> setT(T t) {
        this.t = t;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Test{");
        sb.append("t=").append(t);
        sb.append('}');
        return sb.toString();
    }
}
