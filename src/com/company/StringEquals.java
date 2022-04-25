package com.company;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.ArrayList;

/**
 * @ClassName StringEquals
 * @Description TODO
 * @Author 杨添成
 * @Date 2022/3/17 20:58
 * @Version 1.0
 */
public class StringEquals {
    public static void main(String[] args) {

        String s1 ="AB";
        String s2 = new String("AB");
        String s3 =  "A";
        String s4 = "B";
        String s5 = "A"+"B";
        String s6 = s3 +s4;
        System.out.println(s1==s2);
        System.out.println(s1==s5);
        System.out.println(s1==s6);
    }
}
