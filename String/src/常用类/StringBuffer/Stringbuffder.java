package 常用类.StringBuffer;
/*
* StringBuffder和StrinBuilder的区别
* StringBuffder有synchronize关键字修饰。表示StringBuffder在多线程中运行时安全的
* StrinBuilder是非线程安全的
* */
public class Stringbuffder {
    public static void main(String[] args) {
//        扩容
        StringBuilder sb = new StringBuilder();
        sb.append(1234);
        sb.append("ss");
        sb.append("hal");
        System.out.println(sb);
    }
}
