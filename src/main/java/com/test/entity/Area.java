package com.test.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by admin on 2017/4/2.
 */
public class Area implements Serializable{

    private int id;

    private String name;

    private Date date;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
