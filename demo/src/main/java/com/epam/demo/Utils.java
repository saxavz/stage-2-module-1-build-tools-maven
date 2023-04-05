package com.epam.demo;

import com.epam.utils.StringUtils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if(args.size() == 0){
            return false;
        }

        for(String s : args){
            if(StringUtils.isPositiveNumber(s) == false){
                return false;
            }
        }
        return true;
    }
}