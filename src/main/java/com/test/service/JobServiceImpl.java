package com.test.service;

import com.test.entity.Area;
import com.test.mapper.JobMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2017/4/2.
 */
@Service
public class JobServiceImpl implements JobService {

    @Resource
    private JobMapper jobMapper;
    @Override
    public void sayJobName() {
        System.out.println("testtest");
    }

    @Override
    public List<Area> findAll() {
        return jobMapper.findAll();
    }
}
