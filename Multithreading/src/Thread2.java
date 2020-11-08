/**
 * 实现线程的第二种方式，编写一个类实现runnable接口
 *
 * 用接口的方法实现多线程
 *
 * 面向接口编程
 * 灵活，多使用
 *
 */

public class Thread2 {
    public static void main(String[] args) {

/*//        创建一个可运行的对象
        mys s = new mys();
//        将可运行的对象封装成一个线程对象
        Thread t = new Thread(s);*/

//        合并代码
        Thread t = new Thread(new mys());

//        启动线程
        t.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("主线程"+i);
        }
    }
}

//这并不是一个线程类，只是一个普通类
class mys implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分线程"+i);
        }
    }
}