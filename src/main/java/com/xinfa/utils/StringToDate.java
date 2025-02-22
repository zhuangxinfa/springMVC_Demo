package com.xinfa.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate implements Converter<String,Date> {
    @Override
    public Date convert(String s) {
        if(s==null){
            throw new RuntimeException("请传入正确的数据");
        }
        DateFormat dateFormat  = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return dateFormat.parse(s);
        }catch (Exception e){
            throw new RuntimeException("数据类型转换失败");
        }
    }
}
