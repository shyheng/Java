package io.数据流;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * DataInputStream数据字节数据流
 * 你需要知道你提前写好的顺序
 * 读的顺序和写的顺序一致，才能正常取出
 *
 * 中国电信的，通讯加密
 */
public class DataInputStream1 {
    public static void main(String[] args) throws Exception{
        DataInputStream dis = new DataInputStream(new FileInputStream("date"));

//        开始读
        byte b = dis.readByte();
        short s=dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        boolean sex = dis.readBoolean();
        char c = dis.readChar();


        System.out.println(b);
        System.out.println(s);
        System.out.println(i+1000);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(sex);
        System.out.println(c);

        dis.close();
    }
}
