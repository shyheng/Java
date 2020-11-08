package Map.HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Hashtable的key可以为null吗
 * Hashtable都不可以放null
 * HashMap都可以放null
 * Hashtable方法带有synchronize，线程安全
 * 线程安全有其他方法，这个Hashtable效率低
 *
 * Hashtable和HashMap和一样，底层都是哈希表数据结构
 * Hashtable的初始化容量是11，默认加载因子是0.75f
 * Hashtable的扩容，扩容之后的容量 原容量*2 +1
 *
 *
 */

public class Hashtable1 {
    public static void main(String[] args) {
        Map map = new Hashtable();
//        map.put(null,"123");//空指针异常
//        map.put(100,null);//空指针异常
        System.out.println(map.get(null));
    }
}
