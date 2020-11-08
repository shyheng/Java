/**
 * 实现多线程的第一种方法
 *
 * 启动线程调用m.start();方法
 */
public class Thread1 {
    public static void main(String[] args) {
//        这个是main方法，属于主线程，在线程中运行
//        新建一个分支线程对象
        my m = new my();
//        启动线程

//        这个方法就是单线程
//        m.run();//不会启动线程，不会分配分支栈

        /**
         * m.start();方法的作用是，启动一个分支线程，在jvm中开劈新的的空间，完成，已经结束
         * 这段代码的任务是为了开启一个新的栈空间，m.start()方法结束，线程启动成功
         * 启动成功的线程会自动调run方法，并且run方法在分支栈的栈底部 （压栈）
         * run方法在分支栈的低部，main方法在主栈的底部。run和main平级
         * 亘古不变
         * 从上往下，但是start()方法瞬间结束
         */

        m.start();
//        这里的代码属于主线程
        for (int i = 0; i < 2000; i++) {
            System.out.println("主线程"+i);
        }
    }
}


class my extends Thread {

    public void run() {
//编写程序，这段程序运行在分支中（分支栈）
        for (int i = 0; i < 1000; i++) {
            System.out.println("分线程"+i);
            
        }
    }
}