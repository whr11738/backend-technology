// 获取用户键盘输入内容
package com.whr.hello;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入你的年龄");
        int age = sc.nextInt();
        System.out.println("输入你的名字");
        String name = sc.next();
        System.out.println("你的年龄是" + age);
        System.out.println("你的名字是" + name);
    }
}
