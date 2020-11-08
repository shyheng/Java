package collection.Set和map演示;

import java.util.Set;
import java.util.TreeSet;

/*
* TreeSet集合元素存储特点
* 1无序不可重复，但是可以按照大小自动排序
* 称 可排序集合
*
* 无序没有下标
* */
public class TreeSet1 {
    public static void main(String[] args) {
//        创建
        Set<String> s = new TreeSet<>();
//        添加
        s.add("G");
        s.add("F");
        s.add("S");
        s.add("E");
        s.add("U");
        s.add("W");
        s.add("J");
        s.add("Q");
//        遍历
        for (String s1 :s){
            System.out.println(s1);
        }
    }
}
