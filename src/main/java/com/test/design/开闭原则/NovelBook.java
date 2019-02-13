package com.test.design.开闭原则;

/**
 * Created by admin on 2017/4/15.
 */
public class NovelBook implements IBook {

    // 构造函数
    private String name;
    private int price;
    private String author;

    public NovelBook(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String author() {
        return this.author;
    }
}
