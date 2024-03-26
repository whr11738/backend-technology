// 面向对象三大特征: 封装 继承 多态
// - 封装
public class A {
    static int num1;// 类变量，所有类对象共用的变量，不需要创建对象可直接调用
    int num2;// 对象变量:需要创建对象才可调用
    {}// 实例代码块:创建对象时运行(比构造器还先运行)
    static {}// 静态代码块:类加载时运行(类只加载一次，所以只执行一次)

    public static void fun1(){} // 类方法(只能访问类成员,不能访问对象成员)
    public void fun2(){}// 对象方法(可能访问类成员,也可访问对象成员)
}

// 饿汉式单例 先把对象创建出来
class _A{
    int num = 0;
    // 单例设计模式:定义一个类变量记住类的一个对象
    private static _A a = new _A();

    // 单例设计模式:私有类的构造器(使类无法创建对象)
    private _A(){}

    // 单例设计模式:定义一个类方法返回类的对象
    public static _A getObject(){
        return a;
    }
}

// 懒汉式单例 使用的时候再把对象创建出来
class A_{
    int num = 0;
    // 单例设计模式:定义一个类变量记住类的一个对象
    private static A_ a;

    // 单例设计模式:私有类的构造器(使类无法创建对象)
    private A_(){}

    // 单例设计模式:定义一个类方法返回类的对象
    public static A_ getObject(){
        if(a == null){
            a = new A_();
        }
        return a;
    }
}
