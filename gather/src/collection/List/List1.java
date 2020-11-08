package collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* 测试List接口常用方法
* 1 List集合储存元素特点：有序可重复
* 有序，有下标
* 从0开始，以1递增
*
* 可重复，储存一个1可以在储存一个1
*
* 2 List既然是Collection接口的字接口，有自己的特色的方法
*
* void add(int index, E element)
* Object get(int index)
* int indexOf(Object o)
* int lastIndexOf(Object o)
* Object remove(int index)
* Object set(int index, E element)
*
* 以上方法不需要死记硬背，你以后还得翻，英语得学
* */
public class List1 {
    public static void main(String[] args) {
//       创建List类型集合
        List myList = new ArrayList();

//        添加元素
        myList.add("A");
        myList.add("S");
        myList.add("D");
        myList.add("A");
//        默认都是向列表插指定元素（第一个参数是下标），
//        这个方法使用不多，因为对于ArrayList集合来说效率低
        myList.add(1,"KING");

//        迭代
        Iterator it = myList.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println();
        }


//        根据下标获取元素
        Object o = myList.get(0);
        System.out.println(o);

//        因为有下标所以List集合有自己的特殊的变量方式
//        通过下标遍历，（List特有，Set没有）
        for (int i = 0; i < myList.size(); i++) {
            Object o1 = myList.get(i);
            System.out.println(o1);
//            简写
//            System.out.println(myList.size(i));
        }


//        获取指定对象第一次出现处的索引
        System.out.println(myList.indexOf("KING"));//1
//        获取指定对象最后一次出现的索引
        System.out.println(myList.lastIndexOf("A"));//4


//        删除指定下标位置元素
//        删除下标为0的元素
        myList.remove(0);
        System.out.println(myList.size());//4


//        修改指定元素
        myList.set(2,"W");

//        遍历
        for (int i = 0; i <myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
/*
* 计算机英语
* 增删改查要知道
* 增：add，save，new
* 删：delete，drop，remove
* 改：update，set，modify
* 查：find，get，query，select
*
*
* */