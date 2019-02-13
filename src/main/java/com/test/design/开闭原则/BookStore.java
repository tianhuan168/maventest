package com.test.design.开闭原则;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/4/15.
 */
public class BookStore {
// c初始化书籍列表

    private final static List<NovelBook> list = new ArrayList<NovelBook>();
    static {
        list.add(new NovelBook("书籍1",11,"author1"));
        list.add(new NovelBook("书籍2",22000,"author2"));
        list.add(new NovelBook("书籍3",33,"author3"));
    }

    public static void main(String[] args) {

    }
}
