package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
* 重点
* 当集合的结构发生改变，迭代器必须重新获取，如果用老迭代器 ，会出现
* 异常
*
* 重点
* 在迭代集合的过程中，不能调用集合对象的remove方法，删除元素
* 会出现异常
*
*重点
* 在迭代元素的过程中，一定要使用迭代器Iteratord remove方法删除元素
* 不要使用，集合中自带的remove方法删除元素
* */
public class Collection6 {
    public static void main(String[] args) {
//        创建集合
        Collection c = new ArrayList();

//        Iterator it = c.iterator();//此时的迭代器，指向的是那是集合中没有元素的迭代器
//        一定要注意，集合结构发生改变，迭代器必须重新获取
//        如果没有重写获取，会出现异常
//        加元素
        c.add(1);//Integer类型
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
//        获取迭代器
        Iterator it = c.iterator();
//        遍历，迭代
        while (it.hasNext()){
            Object obj= it.next();
            System.out.println(obj);
        }

        Collection c1 = new ArrayList();
        c1.add("ab");
        c1.add("ss");
        c1.add("f");
        c1.add("fgg");

        Iterator it1 = c.iterator();
        while (it1.hasNext()){
            Object o = it1.next();
//            删除元素，结构发生改变，得重写获取迭代器
//            出现异常
//            c1.remove(o);//直接这么来迭代器和原来的集合状态不同



//            使用迭代器来删，会自动更新迭代器，也会更新集合
            it1.remove();//删除迭代器当前元素
            System.out.println(o);
        }

        System.out.println(c1.size());//迭代器用完就删，所以为0
//       集合就像一个快照，迭代器查找
//
    }
}
