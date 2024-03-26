//泛型
import java.time.Year;
import java.util.ArrayList;

public class generics_ {
    public static void main(String[] args) {
        //ArrayList<String> arr = new ArrayList<String>();;// JDK 1.7.0 后后面不用写 <String>
        ArrayList<String> arr = new ArrayList();// 写 <String>以限制类型
        arr.add("1");
        arr.add("2");
        arr.add("3");
        //arr.add(4);// 泛型限制数组中的元素的类型
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        //泛型类
        myArr<String> a1 = new myArr<>();//传入String 后面的E就代表String
        a1.add("myArr");
        System.out.println(a1.get(0));//myArr

        //泛型方法
        System.out.println(test("test"));

        //泛型方法使用案例
        ArrayList<Car1> car1List = new ArrayList<>();
        car1List.add(new Car1());
        go(car1List);

        ArrayList<Car2> car2List = new ArrayList<>();
        car2List.add(new Car2());
        go(car2List);

        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        //go(dogList);
    }
    public static <T> T test(T t){//传入的是String 那么T就是String
        return t;
    }
    static <isCar extends Car> void go(ArrayList<isCar> c){}//Car1 Car2 是 Car 的子集，Dog不是，限制go方法只能传入Car的子集
    static void go1(ArrayList<?> c){}//?代表一切类型
    static void go2(ArrayList<? extends Car> c){}//限制传入Car或者Car的子类(上限)
    static void go3(ArrayList<? super Car> c){}//限制传入Car或者Car的父类(下限)


}

class myArr<E> {// <E> 这里可以多写，类似 <E,F>，也可以写类，类似 <animal>，传入类或者子类<cat>
    private Object[] arr = new Object[10];
    private int size = 0;

    public boolean add (E e){
        arr[size++] = e;
        return true;
    }
    public E get (int i){
        return (E) arr[i];
    }
}

//泛型接口
interface data<Car>{
    ArrayList<Car> getByName(String name);
}

class data1 implements data<Car>{
    @Override
    public ArrayList<Car> getByName(String name) {
        return null;
    }
}

class Car{}
class Car1 extends Car{}
class Car2 extends Car{}
class Dog{}