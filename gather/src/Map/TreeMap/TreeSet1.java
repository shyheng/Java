package Map.TreeMap;

import java.util.TreeSet;

/**
 * 对于自定义类型来说，可以自定义吗
 * 以下程序中对于person类型，无法排序，因为没有指定对象之间的比较规则
 *
 * 出现异常
 * 出现异常的原因是没有实现Comparable接口
 * */
public class TreeSet1 {
    public static void main(String[] args) {
        person p = new person(12);
//        System.out.println(p);//person[age=12]
        person p2 = new person(32);
        person p3 = new person(23);
        person p4 = new person(56);
        person p5 = new person(54);


        TreeSet<person> shy = new TreeSet<>();
        shy.add(p);
        shy.add(p2);
        shy.add(p3);
        shy.add(p4);
        shy.add(p5);
//        遍历
        for (person c : shy){
            System.out.println(c);
        }
    }
}
class person{
    int age;

    public person(int age) {
        this.age = age;
    }

//    重写toString

    @Override
    public String toString() {
        return "person[age="+age+"]";
    }
}