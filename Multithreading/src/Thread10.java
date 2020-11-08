/**
 * 了解）关于线程的优先级
 * 更偏向谁，大概率方向偏向高的
 */
public class Thread10 {
    public static void main(String[] args) {


        Thread.currentThread().setPriority(1);


        Thread yxj = Thread.currentThread();


        Thread t = new Thread(new my6());
        t.setName("t");
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"sss"+i);
        }
    }
}

class my6 implements Runnable{


    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread().getName()+"tt"+i);
        }
    }
}