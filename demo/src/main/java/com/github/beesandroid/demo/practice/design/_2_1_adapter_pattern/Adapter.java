package com.github.beesandroid.demo.practice.design._2_1_adapter_pattern;

// 适配器
public class Adapter extends Adaptee implements TargetInterface {

    @Override
    public int getFive() {
        return 5;
    }
}
