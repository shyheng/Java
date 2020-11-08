package collection.List.vector;

import java.util.*;

/*
* Vector
* 1底层也是一个数组
* 2初始化容量10
* 3扩容原来的2倍
* 20-40-80-
* 4ArrayList扩容
* 10-15-1.5倍
*
* 5，Vector中所有方法都是线程同步的，带有synchronized关键字
* 使用较少
*
* 6怎样将ArrayList不安全，装换成安全的
* 靠，Collections包
*
* */
public class Vector1 {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
//        扩容，两倍，
        vector.add(11);

//迭代器遍历
        Iterator it = vector.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

//        这个可以以后要使用
        List my = new ArrayList();
//        变成线程安全
        Collections.synchronizedList(my);//my就是安全的

        my.add("111");
        my.add("222");
        my.add("333");
    }
}
