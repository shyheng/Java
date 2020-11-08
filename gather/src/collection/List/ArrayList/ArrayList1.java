package collection.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList集合，
1 默认初始化容量10(底层先创建了一个长度为0的数组 ，当添加第一个元素的时候，初始化为10)
2 集合底层是一个Object[]数组
3 构造方法
   new ArrayList（）;
   new ArrayList(20);

4 ArrayList集合是
扩容1.5倍，减少使用扩容
 private Object[] grow(int minCapacity) {
                int oldCapacity = elementData.length;
                if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
                    int newCapacity = ArraysSupport.newLength(oldCapacity,
                            minCapacity - oldCapacity,   // minimum growth
                            oldCapacity >> 1           //preferred growth);
                                    return elementData = Arrays.copyOf(elementData, newCapacity);
                                    } else {
                                    return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
                                    }
  }

5 数组的优点
检索效率高

6缺点
随机增删元素效率比较低
另外数组无法储存大数据量(很难找到一块非常巨大的内存空间)

7向数组末尾添加元素,效率很高,不受影响

8面试官问你用哪个集合多
ArrayList集合
因为末尾增删好,检索快

ArrayList非线程安全
 * */
public class ArrayList1 {
    public static void main(String[] args) {
//        默认初始化容量10
        List l = new ArrayList();
//        集合中size（）发发发是获取当前集合元素个数，不是获取集合的容量
        System.out.println(l.size());//0


//        指定初始化容量
        List l1 = new ArrayList(20);

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);

        System.out.println(l.size());

//        加一个元素
        l.add(11);

    }
}
