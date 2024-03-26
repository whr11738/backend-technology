// 面向对象三大特征: 封装 继承 多态
// - 多态
public class C {
    String name = "C";
    public void fun(){
        System.out.println("C.fun");
    }
}


class C_ extends C{
    String name = "C_";
    public void fun(){
        System.out.println("C_.fun");
    }
    public void C_fun(){
        System.out.println("C_.fun2");
    }
}
class _C extends C{
    String name = "_C";
    public void fun(){
        System.out.println("_C.fun");
    }
    public void _Cfun(){
        System.out.println("_C.fun2");
    }
}