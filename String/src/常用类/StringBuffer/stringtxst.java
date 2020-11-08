package 常用类.StringBuffer;
/*
* 我们需要进行字符串的频繁拼接
* java中的字符串是不可变，每一次都会产生新的字符串
* 这样会占用大量的方法区内存，造成内存空间的浪费
* String s = "abc";
* s += "ha";
* 就以上代码，就导致在方法区字符串常量池中创建3个对象
* “abc”"ha" “abcha”
* */
public class stringtxst {
    public static void main(String[] args) {
        String s= "";
//        这样做效率低
        for (int i = 0; i < 100; i++) {
            s= s+i;
            System.out.println(s);

        }
    }
}
