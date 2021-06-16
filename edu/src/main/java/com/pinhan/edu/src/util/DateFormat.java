package com.pinhan.edu.src.util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ARK
 * @create 2021-06-16 8:20
 */
@Component
public class DateFormat{
    public static Date format(String date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date d = null;
        try{
            d = dateFormat.parse(date);
        }catch (Exception e){
            e.printStackTrace();
        }
       return d;

    }
    public static List<Date> getBetween(String list){
        String[] str = list.split(",");
        String startTime = str[0];
        String endTime = str[str.length-1];
        List<Date> l = new ArrayList<>();
        l.add(format(startTime));
        l.add(format(endTime));
       return l;
    }
}