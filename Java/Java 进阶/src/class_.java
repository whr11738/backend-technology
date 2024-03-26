//内部类 静态类 局部类 匿名内部类
public class class_ {
    public static void main(String[] args) {
        //调用内部类 需要先把外部类对象先创建出来
        outclass.inclass lbl = new outclass().new inclass();
        lbl.test();

        //调用静态类 可以直接创建
        outclass.staticClass jtl = new outclass.staticClass();
        jtl.test();

        //匿名内部类 编译成一个子类，然后创建一个子类对象出来(用于更方便的创建一个子类对象)
        Animal a = new Animal() {
            @Override
            public void cry() {
                System.out.println("Cry!!!");
            }
        };
        a.cry();
        // 匿名内部类 优化写法
        Animal b = new Animal() {
            @Override
            public void cry() {
                System.out.println("Cry!!!");
            }
        };
        doSomeThing(b);
        // 匿名内部类 优化优化写法
        doSomeThing(new Animal() {
            @Override
            public void cry() {
                System.out.println("Cry!!!");
            }
        });
    }
    public static void doSomeThing(Animal x){
        System.out.println("doSomeThing");
        x.cry();
    }
}

class outclass{
    int num=1;
    //内部类
    public class inclass{
        int num=2;
        public static Number s=1;// jdk16之后才支持定义静态成员
        public void test(){
            int num=3;
            System.out.println("inclass.test()");
            System.out.println(num);//3
            System.out.println(this.num);//2 访问内部变量
            System.out.println(outclass.this.num);//1 访问外部变量
        }
        // 可以正常访问外部内的值
    }
    //静态类 有内部类的所有性质
    public static class staticClass{
        static int num=1;
        public void test(){
            System.out.println("staticClass.test()");
            System.out.println(this.num);// 静态类可以访问外部静态成员，但不能访问对象成员
            //局部类 定义在方法中的类，仅了解就行
            class jbl{}
        }

    }
}

abstract class Animal{
    public abstract void cry();
}