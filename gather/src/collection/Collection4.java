package collection;
/*
* 深入Collection集合的contains方法
** boolean contains(Object o)判断当前集合是否包含元素O，
* 包含返回true，不包含false
*
* contains方法调用equals方法进行比对
* equals方法返回true，就表示包含这个元素
* */


import java.util.ArrayList;
import java.util.Collection;

public class Collection4 {
    public static void main(String[] args) {
//        创建集合对象
        Collection c = new ArrayList();

//        先集合中存储元素
        String s = new String("abc");
        c.add(s);//传地址

        String s1 = new String("dss");
        c.add(s1);//传地址

//        查看元素的个数
        System.out.println("个数"+c.size());//2

//        创建string对象
        String x = new String("abc");
//        集合c中是否包含x，运用equals比较true
        System.out.println(c.contains(x));//true
    }
}
