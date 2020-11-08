package collection.List.linkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
* 链表的优点
* 由于链表上的元素在空间存储上内存地址不连续
* 所以随机增删元素的时候不会有大量元素位移，效率高
* 在开发中遇到增删元素中的元素业务多时，建议用LinkedList
*
* 缺点
* 不能通过数学表达式查找元素的内存地址，每一次查找都是从头节点可以
* 遍历。效率低
*
* ArrayList，把检索发挥到极致
* LinkedList，把增删发挥到极致
*
* 非线程安全
* */
public class linkList1 {
    public static void main(String[] args) {
//LinkList集合底层也要下标
//        注意ArrayList集合之所以检索效率高，不是有下标，而是底层数组的作用
//        LinkedList集合，有下标，但是检索某个元素的时候效率低，因为只能从头节点一个一个遍历找

        List list = new LinkedList();

        list.add("A");
        list.add("B");
        list.add("C");

        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }


    /*    private void linkFirst(E e) {
            final LinkedList.Node<E> f = first;
            final LinkedList.Node<E> newNode = new LinkedList.Node<>(null, e, f);
            first = newNode;
            if (f == null)
                last = newNode;
            else
                f.prev = newNode;
            size++;
            modCount++;
        }*/

    /*    void linkLast(E e) {
            final LinkedList.Node<E> l = last;
            final LinkedList.Node<E> newNode = new LinkedList.Node<>(l, e, null);
            last = newNode;
            if (l == null)
                first = newNode;
            else
                l.next = newNode;
            size++;
            modCount++;
        }

*/


        //    linkedList没有初始化容量
//    最初链表没有任何元素，first和last引用都是null
//    不管是linkedList还是ArrayList,以后都不需要关心
//    因为我们要面向编程，调用的方法都是接口中方法
        List list1 = new ArrayList();//这样写代表底层用数组
//        List list = new LinkedList();//这样写你底层用了双向链表
        
        list1.add("A");
        list1.add("B");
        list1.add("C");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

    }
}
