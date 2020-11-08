package Map;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class myclass {
//    声明一个静态内部类
    private static class ISF{
//        静态方法
        public static void m1(){
            System.out.println("静态内部类执行");
        }

//        实例方法
        public void m2(){
            System.out.println("实例方法得new");
        }
}

    public static void main(String[] args) {

//      类名叫做 myclass.ISF
        myclass.ISF.m1();
        myclass.ISF isf = new ISF();
        isf.m2();

//       给一个Set集合
//        该Set集合中存储对象是myclass.ISF类型
        Set<myclass.ISF> set = new HashSet<>();

//        这个Set集合中存储的字符串对象
        Set<String> strings = new HashSet<>();

        Set<MyMap.MyEntry<Integer,String>> set1 = new HashSet<>();


    }
}
class MyMap{
    public static class MyEntry<K,V>{

    }
}