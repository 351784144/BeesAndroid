package com.github.beesandroid.demo.practice.design._1_4_factory_pattern;

// 具体工厂
public class ConcretetFactory {

    public static AbstractProduct create() {
        return new ConcreteProductA();
//        return new ConcreteProductB();
    }
}
