package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/*
* 测试contains方法
*和remove
*都于equals方法有关
*
* */
public class Collection5 {
    public static void main(String[] args) {
//        创建集合对象
        Collection c = new ArrayList();
//        创建用户对象
        User u = new User("jack");
        User u1 = new User("jaek");

//        加入集合
        c.add(u);

//        判断集合中包含u2。没有重写equals方法这个false
//        System.out.println(c.contains(u1));//false

//        重写equals
        System.out.println(c.contains(u1));//true

//        不重写方法，就是1
        c.remove(u1);
        System.out.println(c.size());//0
 /*
        Integer x = new Integer(1000);
        c.add(x);

        Integer y = new Integer(1000);
        System.out.println(c.contains(y));//true*/


// 创建集合对象
        Collection cc = new ArrayList();
//        创建对象
        String s = new String("hello");
//       加入
        cc.add(s);
        String s1 = new String("hello");
//        删除s1，
        cc.remove(s1);//s.equals(s1) java认为一样
//        查看
        System.out.println(cc.size());//0,说明remove调了equals方法


    }
}
class User{

    private String name;
    public User() {
    }

    public User(String name) {
        this.name = name;
    }

//    重写equals方法  重写是程序员的素养
//这个equals的原理是名字相同就对了

    public boolean equals(Object o) {
        if (o == null||!(o instanceof User)) return false;
        if (o == this)return true;
        User u = (User)o;
        return u.name.equals(this.name);

    }

}