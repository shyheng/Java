public class masht {
    public static void main(String[] args) {
        /*
        * 一共3个对象
        * 方法区字符串常量池有一个heel
        * 堆内存中有两个String对象
        * 一共3个
        * */
        String s1 = new String("heel");
        String s2 = new String("heel");

    }
}
