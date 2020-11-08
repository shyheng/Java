package Map.TreeMap;

import com.sun.source.tree.Tree;

import java.util.Set;
import java.util.TreeSet;

/**
 *1 TreeSet集合底层实际上是一个TreeMap
 * 2 TreeMap底层是一个二叉树
 * 3 放到TreeSet集合中的元素是，TreeMap集合key部分
 * TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小顺序排序
 * 称为 可排序集合
 *
 *降序，传入比较器
 * 更改规则
 * */
public class TreeMap1 {
    public static void main(String[] args) {
//       创建一个TreeSet集合
        TreeSet<String> ts = new TreeSet<>();
//        添加
        ts.add("zs");
        ts.add("s");
        ts.add("f");
        ts.add("dw");
//        遍历
        for (String s : ts){
//            按照字典顺序，升序
            System.out.println(s);
        }

        TreeSet<Integer> set = new TreeSet<>();
        set.add(123456);
        set.add(12356);
        set.add(145);
        set.add(12456);
        set.add(1456);
        set.add(13456);
        for (Integer c:set){
            System.out.println(c);
        }
    }
}
/*数据库中有许多数据
编写程序从数据库当中取出数据，在页面展示用户信息的时候按照生日升序降序
这个时候可以使用TreeSet集合，因为放进去，拿出来有顺序

* */