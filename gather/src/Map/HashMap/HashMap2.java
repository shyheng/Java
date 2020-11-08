package Map.HashMap;

import java.util.HashSet;
import java.util.Set;
/**
 * 向Map集合中存，以及从Map集合取，都是先调用hashCode方法
 * equals方法有可能，也有可能不调用
 *
 * 拿put<k/v> eg 什么时候不用equals
 * k.hashCode()方法返回哈希值
 * 哈希值经过哈希算法换成数组下标
 * 数组下标位置不需要执行上是null，equals
 *
 * 拿get（k）eg 不用equals
 * 如果单向链表上只有一个元素，不会调
 *
 * 注意一个类的equals方法重写了，那么hashCode也的重写
 * 并且温泉水了方法返回true，Hashcode,也一样
 * equals方法返回true表示两个相同在同一个单向链表中比较
 * 他们应该相同所以hashCode的一样
 *
 * equals和hashCode的用IDEA自动生成
 *
 * 结论
 * HashMap集合key部分的，以及放在HashSet集合中的元素，需要同时重写hashCode方法和equals方法
 *
 * 在jdk8中哈希表一个数组中单向链表超过8会转换成树结构，变成六就会成单向链表
 * 为了提高效率，二叉树检索，提高效率
 *
 * 对于哈希表数据结构来说
 * 如果o1和o2的hash值相同，一定是放到单向链表中
 * 当然如果o1和o2的hash值不相同，但是由于哈希算法执行结束之后转换的数组下标可能相同，此时会发生
 * 哈希碰撞
 *
 * 扩容 原来的二倍
 */

public class HashMap2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhang");
        Student s2 =new Student("zhang");
//        重写之前false
//        System.out.println(s1.equals(s2));

//        重写之后
        System.out.println(s1.equals(s2));//true
//两个地址不一样
        System.out.println("s1的hashCode"+s1.hashCode());//重写就一样了
        System.out.println("s2的hashCode"+s2.hashCode());

//        equals结果已经是true了，表示s1和s2是相同的，那么HAshMap
//        只能放进去一个
        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students.size());//按理说是1个，结果是2，不符合hashSet集合

    }
}
