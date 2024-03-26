package com.whr.hello;

public class StringApi {
    public static void main(String[] args) {
        // 直接双引号创建字符串对象
        String a = "a";
        System.out.println(a);// a
        // 构造器创建字符串对象
        String b = new String("b");
        System.out.println(b);// b
        // 字符数组创建字符串对象
        char[] _c = {'1','2','3'};
        String c = new String(_c);
        System.out.println(c);// 123
        // 字符数组创建字符串对象
        byte[] _d = {97,98,99};
        String d = new String(_d);
        System.out.println(d);// abc

        // 获取字符串长度
        System.out.println(d.length());// 3
        // 获取字符串某个位置的字符
        System.out.println(d.charAt(1));// b
        // 获取字符串转字符数组
        System.out.println(d.toCharArray()); //abc
        // 比较2个字符串内容是否一样
        System.out.println(d.equals(c)); // false
        // 比较2个字符串内容是否一样(忽略大小写比较)
        System.out.println(d.equalsIgnoreCase(c));// false
        // 截取字符串内容(包括开始，不包括结尾)
        System.out.println(d.substring(0,2)); // abc -> ab
        // 截取字符串内容(取索引位置以及后面的内容)
        System.out.println(d.substring(2)); // abc -> c
        // 替换字符串内容
        System.out.println(d.replace('c','d')); // abc -> abd
        // 判断字符串是否有目标内容
        System.out.println(d.contains("c")); // true
        // 判断字符串是否以目标内容开头
        System.out.println(d.startsWith("ab")); // true
        // 按照某个字符分割字符串
        String e = "a-b-c";
        String[] _e=(e.split("-"));
        for (int i = 0; i < _e.length; i++) {
            System.out.println(_e[i]);// a b c
        }

    }
}
