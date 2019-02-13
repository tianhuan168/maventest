package com.test.design;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by admin on 2017/4/14.
 */
public class AK47 {

    public static void main(String[] args) throws ParseException {
       Date date =  DateUtils.parseDate("2017-08-15 13:01:14","yyyy-MM-dd","yyyy-MM-dd HH:mm:ss","yyyyMMdd");
       System.out.println(DateUtils.ceiling(date,Calendar.HOUR_OF_DAY));
    }
}
