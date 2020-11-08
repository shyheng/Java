package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* jdk8之后，自动类型推断机制（又叫，钻石表达式）
* */
public class Generic2 {
    public static void main(String[] args) {
//        ArrayList<>这里的类型会自动推断，前提jdk8之后
//        自动推断，钻石表达
        List<Animal> my = new ArrayList<>();

        my.add(new Animal());
        my.add(new Cat());
        my.add(new Bird());

//        遍历
        Iterator<Animal> it = my.iterator();
        while (it.hasNext()){
            Animal a = it.next();
            a.move();
        }

        List<String> strings = new ArrayList<>();

//        strings.add(11);//类型不匹配
        strings.add("11");
        strings.add("ada");

//        System.out.println(strings.size());

//        遍历
        Iterator<String > it1 = strings.iterator();
        while (it1.hasNext()){
//            通过迭代器获取了String类型的数据
//            如果没有的强制类型转换，向下转型
            String s = it1.next();
//            调取了String类的方法Object没有
//            substring截取
            String newS = s.substring(1);
            System.out.println(newS);
        }
    }
}
