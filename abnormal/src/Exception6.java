import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*

异常的两个方法
String msg = exception.getMessage();
exception.printStackTrace();

我们以后查看异常的追踪信息，我们应该怎么看，可以快速的调试程序呢
异常信息追踪信息，从上往下看。
注意，sun不用看，看你的
* */
public class Exception6 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
//            String a = e.getMessage();
//            System.out.println(a);//F:\自动办公软件\wrytxt (系统找不到指定的文件。)
            //            打印异常追踪信息
//            在开发中使用这个，养成好习惯
//            这代码得写，出问题你也不知道
            e.printStackTrace();
            /*
            * java.io.FileNotFoundException: F:\自动办公软件\wrytxt (系统找不到指定的文件。)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:155)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:110)
	at Exception6.m3(Exception6.java:47)
	at Exception6.m2(Exception6.java:43)
	at Exception6.m1(Exception6.java:39)
	at Exception6.main(Exception6.java:16)
	* 因为47行出问题导致了43行
	* 43导致39
	* 39导致16
	* 先看47行
	*

            * */
        }
//        这里程序不耽误执行,服务器不会因为遇到异常而宕机
        System.out.println("ha");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new FileInputStream("F:\\自动办公软件\\wrytxt");
    }
}
