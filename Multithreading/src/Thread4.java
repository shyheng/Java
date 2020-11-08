/**
 * 1 怎样获取当前线程对象
 *        Thread t = Thread.currentThread();
 *        返回值t就是当前线程对象
 *
 * 2 获取线程对象名字
 *          String s = m.getName();
 *         System.out.println(s);
 *
 * 3 修改线程对象名字
 *        m.setName("tttt");
 */
public class Thread4 {
    public static void main(String[] args) {

//        currentThread就是返回当前线程对象
//        这个代码出现在main方法中，所以当前线程就是主线程
//        出现在哪就查哪里的线程
        Thread tt = Thread.currentThread();
        System.out.println(tt.getName());//main

//        创建线程对象
        my1 m = new my1();

//        设置名字,默认名字Thread-0
        m.setName("tttt");

//        获取线程的名字
        String s = m.getName();
        System.out.println(s);

//        创建第二个线程
        my1 m1 = new my1();
        m1.setName("t2");
        System.out.println(m1.getName());

        m1.start();

//        启动线程
        m.start();

    }
}


class my1 extends Thread {
    public void run(){
        for (int i = 0; i < 10; i++) {
//            currentThread就是当前线程
//            如果看线程，需要看你启动那个m还是m1
            Thread t1 = Thread.currentThread();
            System.out.println(t1.getName()+"分支线程"+i);

//            不继承不能用，两个关键字都是继承父类才能用
//            System.out.println(super.getName()+"分支线程"+i);
//            System.out.println(this.getName()+"分支线程"+i);

        }
    }
}