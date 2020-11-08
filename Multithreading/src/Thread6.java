/**
 * 关于Thread.sleep()方法的面试题
 */
public class Thread6 {
    public static void main(String[] args) {
//        创建线程对象
        Thread t = new my2();
        t.setName("t");
        t.start();

//        调用sleep方法
        try {
//            sleep方法在main方法中，所以
            t.sleep(1000*5);//会自动装换成Thread.sleep
//            这行带出现在main中。main睡眠5秒，输出hello world
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("hello world");
    }
}

class my2 extends Thread {
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"hj"+i);
        }
    }
}