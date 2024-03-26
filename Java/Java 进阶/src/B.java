// 面向对象三大特征: 封装 继承 多态
// - 继承
class _B {
    public int x = 1;//暴露场景: 在本类中 同一个包下其他类 任意包下的子类里 任意包下的任意类里
    private int y = 2;//暴露场景: 在本类中
    int z = 3;//暴露场景: 在本类中 同一个包下其他类
    protected int m = 4;//暴露场景: 在本类中 同一个包下其他类 任意包下的子类里

    void fun1(){
        System.out.println("111");
    }

    public _B() {
        this(2);// 调用兄弟构造器
        System.out.println("_B的无参构造器");
    }
    public _B(int a) {
        System.out.println("_B的有参构造器");
    }
}


public class B extends _B{
    // 子类继承父类的非私有成员
    // 不支持一个类继承多个类，但支持多层继承
    public B(){// 构造器 (子类所有构造器,会先运行父类的无参构造器,再运行自己)
        // super();// 默认所有子类都有这行来调用父类的无参构造器
        // super(1);// 父类没有无参数构造器时会报错,可以手动调用父类有参构造器解决
        System.out.println("B的无参构造器");
        System.out.println(x);
        // System.out.println(y); // 私有成员无法访问

        fun1();

    }

    // 方法重写:继承后写一个和父类一样名字的方法，重写后，方法的访问遵循就近原则(声明不变，重新实现)
    @Override // (可有可无)告知下面要重写方法，提高安全性
    void fun1(){
        System.out.println("222");
        System.out.println(x);// 在子类访问其他成员，是遵循就近原则
        System.out.println(super.x);// 前面加super.访问父类同名成员
    }

    public int x = 5;
}
