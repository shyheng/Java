package Map.TreeMap;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet集合可排序的第二种方式，使用比较器的方式
 *
 * 最终结论，
 * 放到TreeSet集合元素想要做到排序，包括
 *     第一种，放在集合中的元素实现Comparable接口
 *     第二种，在构造TreeSet集合的时候给他传一个比较器
 *
 * Comparable和Comparator选择
 * 当比较规则不会发生改变的时候，或者说当比较规则只有1个的时候，建议使用Comparable接口
 * 如果比较规则有多个，并且需要多个比较规则之间频繁切换，建议使用Comparator接口
 *
 *
 */
public class TreeSet4 {
    public static void main(String[] args) {
//创建集合对象，需要比较器，下面这样不行
//        TreeSet<Wugui> s = new TreeSet<>();
//给构造方法传递一共比较器
        TreeSet<Wugui> s = new TreeSet<>(new Comparator<Wugui>(){
//匿名内部类，只是不用写下面的类
            @Override
            public int compare(Wugui o1, Wugui o2) {
                return o1.age - o2.age;
            }
        });

        s.add(new Wugui(123));
        s.add(new Wugui(243));
        s.add(new Wugui(236));

        for (Wugui a : s){
            System.out.println(a);
        }
    }
}

//乌龟
//class Wugui implements Comparable <Wugui>{第一种
class Wugui {
    int age ;

    public Wugui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Wugui{" +
                "age=" + age +
                '}';
    }
}


//单独在这这个编写一个比较器
//比较器实现 Comparator接口
//不写的另一种方法
/*

class WuguiComparator implements Comparator<Wugui>{

    @Override
    public int compare(Wugui o1, Wugui o2) {
//        按照规则
//        按照年龄排序
        return o1.age - o2.age;
    }
}*/
