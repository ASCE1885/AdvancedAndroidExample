package com.asce1885.builderdemo.classicbuilder;

/**
 * Created by guhaoxin on 16/12/25.
 */

public class ConcreteBuilderA implements Builder {

    private Product product;

    @Override
    public void buildPartOne() {

    }

    @Override
    public void buildPartTwo() {

    }

    @Override
    public Product getProduct() {
        return product;
    }
}
