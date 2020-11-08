package 常用类.StringBuffer;
/*
* 如果需要拼接lang
* 调StringBuffer
* StringBuilder
*
*
* 如何优化StringBuffer的性能
* 在创建Stringbuffder的时候尽可能，给定初始化容量。
* 最后减少底层的扩容次数，给大初始化容量
*
* 关键，给一个合适的容量
*
* */
public class Strongbuffer {
    public static void main(String[] args) {
//        创建一个初始化为16个byte[]数组（字符串缓冲区）
        StringBuffer stringBuffer = new StringBuffer();
//        拼接字符串，以后拼接字符串统一用append（）
//        append追加的意思
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append("c");
        stringBuffer.append(3.14);
        stringBuffer.append(true);
        stringBuffer.append(100L);
//数组拷贝。append在追加的时候，如果byte数组慢了，会自动扩容
        System.out.println(stringBuffer);


//        指定初始化容量 StringBuffer对象（字符串缓冲区）
        StringBuffer sb = new StringBuffer(100);
        sb.append("hell");
        sb.append("world");
        sb.append("ss");
        sb.append("sss");
        System.out.println(sb);
    }
}
