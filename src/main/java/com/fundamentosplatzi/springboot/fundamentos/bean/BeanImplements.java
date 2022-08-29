package com.fundamentosplatzi.springboot.fundamentos.bean;

public class BeanImplements implements MyBean {
    @Override
    public void print() {
        System.out.println("Hola desde mi implementacion propia del bean");
    }
}
