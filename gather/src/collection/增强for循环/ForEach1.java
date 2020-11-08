package collection.增强for循环;
/*
* jdk5，退出新特性 增强for循环，或者foreach
* */
public class ForEach1 {
    public static void main(String[] args) {
        int[] a = {1,32,3,4,2,52,38};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

//        增强for
        /*语法
        for（元素类型 变量名：数组或集合）{
        sout（变量名）;
        }
        *
        * */

//        缺点没有下标，在需要使用下标时候，不要
        for (int as : a){
//            as就是数组中的每一个元素
            System.out.println(as);
        }
    }
}
