package com.whr.hello;

import java.util.ArrayList;

public class ArrayListApi {
    public static void main(String[] args) {
        // 创建一个的ArrayList集合对象(默认长度是10)
        ArrayList a=new ArrayList();// ArrayList<String> a=new ArrayList();限制类型
        a.add("0");
        a.add("1");
        a.add("2");
        System.out.println(a);// [0,1,2]

        // 在某个索引位置插入数据
        a.add(1,"3");// [0,3,1,2]
        System.out.println(a);
        // 获取在某个索引位置内容
        System.out.println(a.get(0));// 0
        // 在某个索引位置删除数据
        a.remove(1);
        System.out.println(a);// [0,1,2]
        // 获取集合的大小(返回存储的元素个数)
        System.out.println(a.size());// 3
        // 根据元素删除数据(默认删除第一个出现的目标)
        System.out.println(a.remove("2"));// true 返回删除成功与否
        System.out.println(a);// [0, 1]
        // 修改索引处的元素
        System.out.println(a.set(0, "3"));// 0 返回修改前的元素
        System.out.println(a);// [3,1]
    }
}
