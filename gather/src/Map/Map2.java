package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
* Map集合遍历
* */
public class Map2 {
    public static void main(String[] args) {
//        第一种方式，获取所有的key，通过遍历key，来遍历value
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhang");
        map.put(2,"li");
        map.put(3,"wang");
        map.put(4,"zhao");
//        遍历Map集合
//        先获取所有的key。所有的key  是一个Set集合
        Set<Integer> keys = map.keySet();
//        遍历key，获取value
//        1 迭代器
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            Integer i = it.next();
            String value = map.get(i);
            System.out.println(value);
        }
//        2 foreach
        for (Integer i :keys){
            String value =map.get(i);
            System.out.println(value);
        }

//        第二种方式Set<Map.Entry<K,V>> entrySet()
//        获取Map中所有的value，返回一个Collection
//        Set集合是map.entry
        Set<Map.Entry<Integer,String>> set = map.entrySet();
//        迭代
        Iterator<Map.Entry<Integer,String>> it1 = set.iterator();
        while (it1.hasNext()){
            Map.Entry<Integer,String> o = it1.next();
            Integer j = o.getKey();
            String s1 = o.getValue();
            System.out.println(j+"----"+s1);
        }

//        foreach,
//        效率高，大数据量
//        获取都是从1那
        for (Map.Entry<Integer,String> q : set){
            System.out.println(q);
        }
    }
}
