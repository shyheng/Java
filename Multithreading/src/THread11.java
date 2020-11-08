/**
 * 让位，当前线程暂停，回到就绪状态，让给其他线程
 * Thread.yield()
 *
 */
public class THread11 {
    public static void main(String[] args) {
        Thread t = new Thread(new my7());
        t.setName("t");
        t.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName()+"s"+i);
        }
    }
}


class my7 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
//            每100个让位一次
//            意思意思让位
            if (i%100 == 0){
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName()+"S"+i);
        }
    }
}