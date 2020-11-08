package Map.TreeMap;

import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        user p = new user(12);
//        System.out.println(p);//person[age=12]
        user c1 = new user(32);
        user c2 = new user(23);
        user c3 = new user(56);
        user c4 = new user(54);


        TreeSet<user> shy = new TreeSet<>();
        shy.add(c1);
        shy.add(c2);
        shy.add(c3);
        shy.add(c4);

//        遍历
        for (user c : shy){
            System.out.println(c);
        }
    }
}

//放在TreeSet集合中的元素需要实现compareTo接口
//并且实现compareTo方法，equals可以不用写
class user implements Comparable<user>{
    int age;
    public user(int age){
        this.age = age;
    }
//需要在这个方法中编写比较的逻辑，或者说比较的规则，按照上面进行比较
//k.compareTo(t.key)
//    拿着参数k和集合中的每一个k进行比较，返回值可能是，<0,>0,=0

//按照年龄升序或降序

    @Override
    public int compareTo(user c) {//c1.compareTo(c2);
//        this是c1
//        c是c2
//c1和c2比较的时候,就是this和c比较
// 新手写法
        /*       int age1 = this.age;
        int age2 = c.age;
        if (age1 == age2){
            return 0;
        }else if (age1 > age2){
            return 1;
        }else {
            return -1;
        }
*/
        return this.age - c.age;//<0,>0,=0
    }
//    重写toString，不重写出现内存地址
    public String toString(){
        return "user[age"+age+"]";
    }
}