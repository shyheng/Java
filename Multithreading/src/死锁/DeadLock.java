package 死锁;

/**
 * 要求会写
 * 不然开发很难调试
 */
public class DeadLock {
    public static void main(String[] args) {
        Object o = new Object();
        Object o3 = new Object();

        Thread t = new myT1(o,o3);
        Thread t2 = new myT2(o,o3);

        t.start();
        t2.start();
    }
}

class myT1 extends Thread{
    Object o1;
    Object o2;
    public myT1(Object o1,Object o2){
        this.o1 = o1;
        this.o2 = o2;
    }
    public void run(){
       synchronized (o1){
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           synchronized (o2){

           }
        }
    }
}


class myT2 extends Thread{
    Object o1;
    Object o2;
    public myT2(Object o1,Object o2){
        this.o1 = o1;
        this.o2 = o2;
    }
    public void run(){
        synchronized (o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){

            }
        }
    }
}