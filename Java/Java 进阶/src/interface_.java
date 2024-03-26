//接口类 实现类 解决了对象只能单继承的问题，不能创建对象，用来被类实现的(implements)，实现接口的类叫实现类
interface interface_ {
    String name="123";//成员变量(默认常量)
    void test1();//成员方法（默认抽象方法）
    //不能有方法体，构造器，方法块
}
interface _interface {
    String name="456";//成员变量(默认常量)
    void test2();//成员方法（默认抽象方法）
    //不能有方法体，构造器，方法块
}
//JDK 8 开始新增的三种形式方法
interface _interface2 {
    default void test1(){};//默认方法，默认会被加上public修饰，只能用接口的实现类对象调用
    private void test2(){};//私有方法，必须用private修饰(jdk9后新增)，只能在接口里面被访问
    static void test3(){};//静态方法，默认会被加上public修饰，只能用接口名调用
}

//实现类要把所有抽象方法写完
class api implements interface_,_interface{
    public void test1(){
        System.out.println("test1");
    }
    public void test2(){
        System.out.println("test2");
    }
}

//接口是多继承的
//一个接口继承多个接口，如果多个接口中存在方法签名冲突，则此时不支持多继承。
//一个类实现多个接口，如果多个接口中存在方法签名冲突，则此时不支持多实现。
//一个类继承了父类，又同时实现了接口，父类中和接口中有同名的默认方法，实现类会优先用父类的。
//一个类实现了多个接口，多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可。
interface api2 extends interface_,_interface{
}
class api3 implements api2{
    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }
}