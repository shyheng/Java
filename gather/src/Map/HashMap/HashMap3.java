package Map.HashMap;

import java.util.Map;

/**
 * HashMap集合key部分允许null吗
 *
 *
 */

public class HashMap3 {
    public static void main(String[] args) {
        Map map = new java.util.HashMap();

//        HashMap集合允许key为null
        map.put(null,null);
        System.out.println(map.size());//1

//        key如果重复，value覆盖
        map.put(null,100);
        System.out.println(map.size());//1

//        通过key获取value
        System.out.println(map.get(null));//100
    }
}
