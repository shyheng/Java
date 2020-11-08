package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*

Map接口中常用的方法
1 Map和Collection没有继承关系

2 Map集合以key和value的方法存储数据：键值对
key和value都是引用数据类型
key和value都是存储对象的内存地址
key起到主导作用地位，value是key的一个附属品

3Map接口中常用方法
V put(K key, V value) 向Map集合中添加键值对
V get(Object key)  通过key获取value
void clear()  清空Map集合
boolean containsKey(Object key) 判断MAp中是否包含某个key
boolean containsValue(Object value)判断MAp中是否包含某个value

V remove(Object key) 通过key删除键值对
int size()获取Map集合中键值对的个数
Set<Map.Entry<K,V>> entrySet()  获取Map中所有的value，返回一个Collection

Set<K> keySet() 获取Map集合所有的key（所有的键是一个Set集合）
* */
public class Map1 {
    public static void main(String[] args) {
//        创建map集合对象
        Map<Integer,String> map = new HashMap<>();
//        向Map集合中添加键值对
        map.put(1,"zhang");//1自动装箱
        map.put(2,"li");
        map.put(3,"wang");
        map.put(4,"zhao");

//        通过key获取value
        String value = map.get(2);
        System.out.println(value);

//        获取键值对数量
        System.out.println("键值对数量"+map.size());

//        通过key删除key 和value
        map.remove(2);
        System.out.println("键值对数量"+map.size());

//        判断是否包含某个key
//        底层调用equals方法
        System.out.println(map.containsKey(2));//true
//        判断是否包含某个value
        System.out.println(map.containsValue("zhang"));//true

//        获取所有的Value
        Collection<String> values = map.values();
        for (String s : values){
            System.out.println(s);
        }

//        清空map集合
        map.clear();
        System.out.println("键值对数量"+map.size());
//        判断是否为空
        System.out.println(map.isEmpty());//true
    }
}
