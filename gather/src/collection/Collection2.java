package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
* 关于集合遍历，迭代
* */
public class Collection2 {
    public static void main(String[] args) {
long a = System.currentTimeMillis();

        //        注意：以下的遍历方式、迭代方式，是所有Collection通用的一种方式
//        在Map集合中不能使用，在所有的Collection以及子类中使用
//        创建集合对象
        Collection c = new ArrayList();//后面的集合无所谓，主要是抗collection接口怎么遍历
//        添加元素
        c.add(1200);
        c.add(3.14);
        c.add(new Object());
        c.add(true);
        c.add("hello");
        c.add("world");
        c.add("lll");

//        集合从collection进行遍历
//        第一步，获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator();
//        第二步：通过以上获取的迭代器对象开始迭代对象、遍历集合

        /*
        以下两个方法是迭代器对象Iterator中的方法
        * boolean hasNext() 如果迭代具有更多元素，则返回 true 。
          E next() 返回迭代中的下一个元素。
        * */

        /*
        boolean hasNext = it.hasNext();
        if (hasNext){
//           不管你之前存储什么他都是Object
            Object o = it.next();
            System.out.println(o);
        }*/
//        遍历、迭代
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }

        long b = System.currentTimeMillis();
        System.out.println("用时"+(b-a));
    }
}
