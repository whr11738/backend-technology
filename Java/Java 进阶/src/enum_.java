// 枚举类
public class enum_ {
    public static void main(String[] args) {
        //枚举类不能创建对象，构造器是私有的
        enum1 x = enum1.X;
        System.out.println(x);

        //枚举类提供额外的API
        enum1[] as = enum1.values();// 拿到全部对象
        enum1 y = enum1.valueOf("Y");// 拿到某个对象
        System.out.println(y);// Y
        System.out.println(y.ordinal());// 索引 1

        //使用案例
        getSex(enum4.GIRL);

    }
    // 案例
    enum enum4{
        GIRL,BOY;
    }
    public static void getSex(enum4 sex){
        switch (sex){
            case BOY:
                System.out.println("男");
                break;
            case GIRL:
                System.out.println("女");
                break;
        }
    }
}

enum enum1 {
    //枚举类:
    //第一行只能罗列一些名称,且每个常亮记住的都是枚举类的一个对象
    //第二行开始可以定义各种成员
    //构造器都是私有的
    //不可以被继承
    X,Y,Z;
}

// 抽象枚举
enum enum2{
    X(){
        public void test(){};
    },
    Y(){
        public void test(){};
    };
    public abstract void test();
}

// 可以用来写单例
enum enum3{
    X;
}
