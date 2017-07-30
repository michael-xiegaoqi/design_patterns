package com.henser.creationalPatterns.builder.simpleExample;

/**
 * 抽象建造者类Builder
 * Created by henser on 2017/7/28.
 */
public interface Builder {

    public void buildPart1();
    public void buildPart2();
    public Product retrieveResult();

}
