package com.asce1885.builderdemo.classicbuilder;

/**
 * Created by guhaoxin on 16/12/25.
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void buildProduct() {
        this.builder.buildPartOne();
        this.builder.buildPartTwo();
    }

    public Product getProduct() {
        return this.builder.getProduct();
    }

}
