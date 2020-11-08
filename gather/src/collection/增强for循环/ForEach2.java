package collection.增强for循环;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* 集合使用foreach
* */
public class ForEach2 {
    public static void main(String[] args) {
//        创建List集合
        List<String> strings = new ArrayList<>();
//        添加元素
        strings.add("hell");
        strings.add("he");
        strings.add("ll");
        strings.add("hl");

//        遍历,迭代器
        Iterator<String> it = strings.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

//        使用下标（只针对有下标的集合）
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

//        使用forEach
        for (String s : strings){//s代表集合中的元素
            System.out.println(s);
        }
    }
}
