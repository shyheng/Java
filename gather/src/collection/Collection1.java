package collection;

import java.util.ArrayList;
import java.util.Collection;

/*
* 关于java.util.Collection接口中的常用方法
* 1 Collection中能存储什么元素
*   没有使用“泛型”之前，Collection中可以存储Object的所有子类型
*   使用泛型之后，Collection中只能储存某个具体类型
*   后期学习泛型
*
* 2 collection常用方法
*
* Boolean add (Object e)//向集合中添加元素
* int size() //获取集合中的元素个数
* void clear()清空集合
* boolean contains(Object o)判断当前集合是否包含元素O，包含返回true，不包含false
*  Boolean remove(Object o)删除集合中某个元素
* boolean isEmpty() 判断该集合中的个数是否为0
* Object[] toArray（） 调这个方法可以把集合转换成数组（了解）
*
*
*
*
* */
public class Collection1 {
    public static void main(String[] args) {
//创建一个集合对象
//        Collection c = new Collection();//接口是抽象，无法实例化

//        多态，父类指向子类
        Collection c = new ArrayList();
//        测试Collection接口中的常用方法
        c.add(1200);//自动装箱，实际上是放进去了一个内存对象
        c.add(3.14);//自动装箱
        c.add(new Object());
        c.add(new Student());
        c.add(true);

//        获取集合中元素的个数
        System.out.println("个数"+c.size());

//        清空集合
        c.clear();
        System.out.println("个数"+c.size());

//        在添加元素
        c.add("hello");
        c.add("world");
        c.add("lll");

//        判断集合中是否包含
        boolean f = c.contains("lll");
        System.out.println(f);
        boolean f1 = c.contains("lll1");
        System.out.println(f1);
        System.out.println(c.contains("world"));

        System.out.println("个数"+c.size());

//        删除某个元素
        c.remove("lll");
        System.out.println("个数"+c.size());

//        判断集合是否为空，集合中是否存在元素
        System.out.println(c.isEmpty());//false
//        清空
        c.clear();
        System.out.println(c.isEmpty());//true(集合中没有元素)

        c.add("abs");
        c.add("as");
        c.add(100);
        c.add(0.2);

//        装换成成数组(了解)
        Object[] b = c.toArray();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }


    }

    private static class Student {
    }
}
