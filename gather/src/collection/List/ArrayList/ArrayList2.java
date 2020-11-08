package collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List my = new ArrayList();
        List my1 =new ArrayList(100);

//        创建hashSet集合
        Collection c  =new HashSet();
        c.add(12);
        c.add(13);
        c.add(141);
        c.add(453);

//        通过这个构造方法就可以将HashSet集合装换成List集合
        List my2 = new ArrayList(c);
        for (int i = 0; i < my2.size(); i++) {
            System.out.println(my2.get(i));
        }
    }
}
