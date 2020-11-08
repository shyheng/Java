package collection.Set和map演示;

import java.util.HashSet;
import java.util.Set;

/*
* hashSet集合
* 无序不可重复。
* */
public class Hashset1 {
    public static void main(String[] args) {
//        演示
        Set<String> s = new HashSet<>();

//        添加
        s.add("asd");
        s.add("sdf");
        s.add("4");
        s.add("f");
        s.add("sf");
        s.add("sfa");
        s.add("ggrw");

//        遍历
        /*
        * 1 存储顺序和取出的顺序不同
        * 2 不可重复
        * 3 放到HashSet集合中的元素，实际上是放到了map的key部分
        *
        * */
        for (String s1 : s){
            System.out.println(s1);
        }
    }
}
