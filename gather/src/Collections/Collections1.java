package Collections;

import java.util.*;

/**
 * Collection是集合接口
 * Collections是工具类，方便集合的操作
 */
public class Collections1 {
    public static void main(String[] args) {
//        ArrayList集合不是线程安全的
        List<String> list = new ArrayList<>();

//        变成线程安全
        Collections.synchronizedList(list);

//        排序
        list.add("as");
        list.add("ase");
        list.add("asr");
        list.add("ass");
        list.add("asgb");

        Collections.sort(list);

        for (String s : list){
            System.out.println(s);
        }

        List<Wugui2> wuguis = new ArrayList<>();
        wuguis.add(new Wugui2(1444));
        wuguis.add(new Wugui2(52334));

//       对List集合中元素排序，需要保证List集合中的元素实现了Comparable接口

        Collections.sort(wuguis);
        for (Wugui2 q :wuguis){
            System.out.println(q);
        }

        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
//        将Set集合装换成List集合
        List<String> m = new ArrayList<>(set);

        Collections.sort(m);

        for (String e : m){
            System.out.println(e);
        }
//这个方式也行
//        Collections.sort(List集合,比较对象);
    }
}

class Wugui2 implements Comparable<Wugui2>{
    int age;

    public Wugui2(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Wugui2 o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Wugui2{" +
                "age=" + age +
                '}';
    }
}
