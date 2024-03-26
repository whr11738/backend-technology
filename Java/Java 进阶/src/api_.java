import java.util.Objects;

//API
public class api_ {
    public static void main(String[] args) {
        //Objects
        apiClass a1 = new apiClass("a1");
        apiClass a1_ = new apiClass("a1");
        //Objects.toString()
        System.out.println(a1);//输出a1，其实是输出a1.toString()，重写以变更返回的内容
        //Objects.equals()
        System.out.println(a1.equals(a1_));//比较a1与a1_的地址
        //Objects.clone()
    }
}

//允许类的对象可以克隆需要继承
class apiClass implements Cloneable{
    public String name;
    public apiClass() {}
    public apiClass(String name) {
        this.name = name;
    }

    // 重写toString
    @Override
    public String toString() {
        return this.name;
    }

    // 重写equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        apiClass apiClass = (apiClass) o;
        return Objects.equals(name, apiClass.name);
    }

    // 重写clone方法
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}