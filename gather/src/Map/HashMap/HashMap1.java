package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
* HashMap集合
* 1 HashMap集合底层是哈希表、散列表的数据结构
* 2 哈希表
*   哈希表是数组和单链表的结合体
*   数组查询效率高
*    单向链表随机增删改查高
*    哈希表结合以上两种数据，充分发挥他们的优势
*
* 3 HashMap集合底层的源代码
                 public class HashMap{
                //HashMap底层实际上是一个数组（一维数组）
                      Node<K,V>[] table
//               静态内部类HashMap.Node
*                    static class Node<K,V>{
*                       final int hash;//哈希值是key的hashCode（）方法迭代执行结果，同一个单向链表上所有节点hash相同，但是k不能一样
*                        哈希值通过哈希函数、算法，可以装换成，数组下标
                        final K key;存储到Map集合中的key
                        V value;存储Map集合中的value
                        Node<K,V> next;下一个节点地址
* }
*        *
                 }
*
*
* 4 最重要掌握
* Map.put(k,v) 添加元素
* v = map.get(k)  取元素
*以上两个方法的实现原理必须要掌握
*
* 重点，HashMap集合的key，会先后调用两个方法，
* 一个方法是hashCode（），一个方法是equals()，那么这两方法都需要重写
*
* 5 HashMap集合的key部分特点
* 无序不可重复
* 无序，不一定挂在哪个单链表
* 不可重复，equals会保证不可重复
* 重复key，Value覆盖
* 所以HashMap集合中的元素也需要equals方法和HashCode
*
* HashCode（）方法重写返回一个固定不变的值，就会导致哈希表成单向链表
*
* 6 哈希表HashMap使用不当是无法发挥性能
* 假设将所有的Hashcode方法固定的值，那么底层哈希表变成了
* 纯单向链表，这个情况成为散列分布不均匀
*
* 什么是散列分布不均匀
* 假设有100元素，10个单向链表，每个节点有十个，这是最后的，是散列分布均匀
*
* 假设所有的hashCode的方法都不一样，那么成一维数组，散列分布不均匀
*
* 所以，重写hashCode（）方法  一定需要技巧
*
* 7  重点放在HashMap集合key部分的元素，以及放在HashMap集合中的元素
* 需要同时重写hashCode和equals方法
*
* 8 HashMap集合 的默认初始化容量是16，默认因子是0.75
* 这个默认因子是当HashMap集合底层数组的容量达到75%的时候，数组开始扩容
*
* 重点HashMap集合初始化容量必须是二的倍数，官方推荐
* 为了提高HashMap集合的存取效率
*
* 
* */
public class HashMap1 {
    public static void main(String[] args) {
//        测试hashmap集合key部分的元素特点
//        Int 是key，他的hashCode和equals都重写了
        Map<Integer,String> map = new HashMap<>();
        map.put(11,"z");
        map.put(22,"s");//重复被覆盖
        map.put(22,"w");
        map.put(44,"f");
        map.put(55,"g");

        System.out.println(map.size());

//        遍历HashMap集合
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for (Map.Entry<Integer,String> s : set){
//            hashMap 集合key验证无序不可重复
            System.out.println(s);
        }
    }
}
