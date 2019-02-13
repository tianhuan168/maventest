package com.test.service;

import com.test.entity.Area;

import java.util.List;

/**
 * Created by admin on 2017/4/2.
 */
public interface JobService {

    void  sayJobName();

    List<Area> findAll();
}
