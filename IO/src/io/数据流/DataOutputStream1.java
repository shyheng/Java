package io.数据流;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * DataOutputStream
 *   数据专属流
 *   这个流可以将数据同数据的类型一并写入文件
 *    注意   这个文件不是普通文件(用记事本打不开)
 *
 */
public class DataOutputStream1 {
    public static void main(String[] args) throws Exception{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("date"));

//        写数据
        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400L;
        float f = 3.0F;
        double d = 3.14;
        boolean sxe = false;
        char c = 'a';

        dos.writeByte(b);//将数据同数据的类型一并写入文件
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(sxe);
        dos.writeChar(c);

        //刷新
        dos.flush();
//        关闭
        dos.close();

    }
}
