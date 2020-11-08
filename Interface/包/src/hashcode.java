/*
hashcode()方法
源代码
public native int hashCode();

hashcode()方法返回值是哈希码
所以hashcode()方法的执行机构可以看做一个java对象的内存地址


 */

public class hashcode {
    public static void main(String[] args) {
        Object o = new Object();
        int hashcodeValue = o.hashCode();
//        对象内存地址经过哈希算法转换的一个数字。可以通到看做内存地址。
        System.out.println(hashcodeValue);

        myclass mc = new myclass();
        int hashcode = mc.hashCode();
        System.out.println(hashcode);

        myclass mc1 = new myclass();
        System.out.println(mc1.hashCode());

    }
}

class myclass{

}


