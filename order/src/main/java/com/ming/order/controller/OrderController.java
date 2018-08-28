package com.ming.order.controller;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author chenmingcan
 */
public class OrderController {

    private final static Pattern PHONE = Pattern.compile("(^1[3|4|5|7|8]\\d{9}$)|(^09\\d{8}$)");

    public static void main(String[] args) {
        List<String> list = Arrays.asList("你好啊,百悟不是", "滚开啊,走了啊");
        List<String> collect = list.stream().map(str -> (str.replace(",", "$$$$"))).collect(Collectors.toList());
        collect.forEach(System.out::println);
        Instant instant = Instant.now();
        String str = "13596969611";
        Matcher matcher = PHONE.matcher(str);
        if (matcher.find(0)) {
            System.out.println(instant.getEpochSecond());
            System.out.println(System.currentTimeMillis());

            System.out.println("yes");
        } else {
            System.out.println("no");

        }
    }
}
