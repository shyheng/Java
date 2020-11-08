package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
* 集合遍历，迭代
* */
public class Collection3 {
    public static void main(String[] args) {
//        创建集合对象
        Collection c = new ArrayList();//ArrayList集合有序可重复
//        添加元素
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(1);

//        迭代集合
        Iterator it = c.iterator();
        while (it.hasNext()){
//            存进去什么类型，出来什么类型
//            只不过println调toString方法
            System.out.println(it.next());
        }


//        HashSet集合,无序不可重复

        Collection c1 = new HashSet();
        c1.add(12);
        c1.add(3);
        c1.add(45);
        c1.add(54);
        c1.add(3);
        c1.add(35);
        c1.add(353);
        c1.add(23);
        c1.add(5);

        Iterator it1 = c1.iterator();

        while (it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}
