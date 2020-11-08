package 守护线程;

/**
 * 守护线程
 * 主方法完成不管你是什么，自动关了
 */
public class Thread14 {
    public static void main(String[] args) {
        Thread t = new BakData();
        t.setName("备份数据的线程");
//        设置守护线程非常简单
        t.setDaemon(true);
        t.start();

//        主线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"<"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class BakData extends Thread{
    public void run(){
        int i =0;
//        即使是死循环，也会自动终止
        while (true){
            System.out.println(Thread.currentThread().getName()+">"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}