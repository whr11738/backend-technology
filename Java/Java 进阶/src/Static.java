public class Static {
    public static void main(String[] args) {
        /**
         * 封装
         */
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1);
        System.out.println(a2);
        // 单例
        // 确保只有单个对象被创建 以下输出的两个对象地址一样
        System.out.println(_A.getObject());
        System.out.println(_A.getObject());

        /**
         * 继承
         */
        System.out.println("-----------");
        B b = new B();

        /**
         * 多态
         */
        System.out.println("-----------");
        // 对象多态: C_与_C都是继承C,这是对象多态
        C c1 = new C_();
        C c2 = new _C();
        // 行为多态: 对于方法,编译看左边,运行看右边(C有fun就不会报错,但会运行C_的fun)
        c1.fun();// C_.fun
        c2.fun();// _C.fun
        // 行为多态: 对于变量,编译看左边,运行看左边(返回父类C的变量name)
        System.out.println(c1.name);// C
        System.out.println(c2.name);// C
        // 多态优点:解耦合，右边对象随时切换,后续业务随时改变
        C c3 = new C_();// C c3 = new _C();
        // 多态优点:使用父类类型的变量作为形参，可以接受一切子类对象
        go(c1);// 行数要求C,C子类也可以传入
        go(c2);// 行数要求C,C子类也可以传入
        // 多态缺点:无法调用子类的方法
        // c3.C_fun();
        // 解决 多态无法调用子类的方法:强制类型转换
        C_ c4 = (C_) c1;// c1是C_ 可以转换C_
        // _C c5 = (_C) c1;// c1是C_ 不可以转换_C 编译不报错但运行会报错
        if(c1 instanceof _C){// 类型判断再转换
            _C c5 = (_C) c1;
            c5._Cfun();// 可以调用子类方法了
        }else{
            C_ c5 = (C_) c1;
            c5.C_fun();// 可以调用子类方法了
        }
        c4.C_fun();// 可以调用子类方法了

        /**
         * final 修饰符
         */
        // final 修饰符 有且仅能赋值一次 基本类型数据不变 引用类型地址不变
        System.out.println("-----------");
        final class f1{}
        // final class f2 extends f1{} // final 修饰的类不能被继承
        final int f3;
        f3 = 1;
        // f3 = 2; // final 修饰的变量不能被二次赋值
    }

    public static void go(C c){
        System.out.println(c);
    }
}

// 抽象类 无法创建对象，作为一种特殊的父类让子类继承并实现
abstract class D {
    // 常量 static final 修饰的成员变量
   public static final double PAI = 3.14;
   // 抽象方法 没有方法体，只能写再抽象类中
   public abstract void run();
}

class E extends D{
    // 继承抽象类必须 重写抽象类全部抽象方法 否则这个类也必须定义成抽象类
    public void run(){
        System.out.println("D.run()");
    }
}