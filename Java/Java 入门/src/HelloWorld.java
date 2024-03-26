//基础语法
package com.whr.hello;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("hello world");// 打印完不换号
        System.out.println("hello world"); //打印完换行
        //  1、整型 byte 、short 、int 、long
        //  2、浮点型 float 、 double
        //  3、字符型 char
        //  4、布尔型 boolean
        long lg = 13535298986L;
        float f = 3.14F;

        int a = 20;
        byte b = (byte)a;//20 强制类型转换 (有溢出风险)

        System.out.println(5 / 2);// 2
        System.out.println(1.0 * 5 / 2);// 2.5

        int a1 = 1;
        int b1 = 1;
        int c1 = a1++;// 1 先用后加
        int d1 = ++b1;// 2 先加后用

        byte x = 10;
        byte y = 30;
        x += y;// 40 等效 x = (byte)(x+y)

        // & - 与    | - 或    ! - 非   && - 短路与(左为false右边不执行)   || - 短路或(左为true右边不执行)
        //  && 优先级高于 ||
        // 异或 前后不同为真，否则为否
        boolean r1 = true ^ true;// false
        boolean r2 =  false ^ false;// false
        boolean r3 =  false ^ true;// true
        boolean r4 =  true ^ false;// true

        // 数组
        int[] arr = new int[]{1,2,3};
        int[] arr2 = {1,2,3};
        int[] arr3 = new int[3];// 动态初始化数组 [0,0,0]

        print();
        int[] arr4 = {};
        int[] arr5 = null;
        int[] arr6 = {55,22,33,44,11};
        printArray(arr4);
        printArray(arr5);
        printArray(arr6);

        // 面向对象入门
        _class obj1 = new _class();
        obj1.a=1;
        obj1.b=2;
        obj1.ab();

        // 包
        // 同一个包下的程序可以直接访问
        // 访问其他包下的程序必须导入才能访问
        // 除了Java.lang和Java.util，其他Java提供的程序也要导入包
        // 无法多个导入同名程序 但可以 com.whr.hello._class xyz = new com.whr.hello._class();这样的方式来使用同名程序
        com.whr.hello._class xyz = new com.whr.hello._class();
        xyz.hello();
    }
    // 需要返回值 需要形参 的方法
    // 打印数组
    public static void printArray(int[] array){
        if(array == null) {
            System.out.println(array);
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i != array.length - 1?array[i]+",":array[i]);
        }
        System.out.println("]");
    }
    // 不需要返回值 不需要形参 的方法
    public static void print(){
        System.out.println("print");
    }
    // 方法重载 形参 个数，类型，顺序 不同就可以出现 多个名称相同的方法（不关心形参名称）
    public static void print(int a){
        System.out.println("print"+a);
    }


}
