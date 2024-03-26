package com.whr.hello;

public class _class {
    public _class(){
        // 构造器 每一个类都自动会生成一个这样的空构造器
    }
    public _class(int a){
        // 方法重载的构造器，这样就不会自动会生成一个这样的空构造器，最好自己写一个空构造器
    }
    int a;
    int b;
    // 私有变量，外面不能直接引用
    private int c;
    public void ab(){
        System.out.println(a + b);
        System.out.println(this.a);// 输出本身的a，this指向自身
    }
    public void hello(){
        System.out.println("hello");
    }
    // 私有方法，外面不能直接引用
    private void ac(){
        System.out.println(a + b);
    }
}
