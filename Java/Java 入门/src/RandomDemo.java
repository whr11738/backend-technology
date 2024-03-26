package com.whr.hello;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int i = 0;
        while (i < 100) {
           int data = r.nextInt(1,10);// 1-9 的随机数
           System.out.println(data);
           i++;
        }
    }
}
