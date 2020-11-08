package 考试4;

/**
 *doOther方法执行的时候需要等待dosome方法吗？
 *
 * 需要，因为静态方法是类锁，不管创建了几个对象，类锁只有一把
 */
public class Exam1 {
    public static void main(String[] args) throws InterruptedException {
        myclass m = new myclass();
        myclass m1 = new myclass();

        Thread t1 = new myThread(m);
        Thread t2 = new myThread(m1);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        Thread.sleep(10000);
        t2.start();
    }
}

class myThread extends Thread{
    private myclass mc;
    public myThread (myclass c){
        this.mc = c;
    }
    public void run(){
        if (Thread.currentThread().getName().equals("t1")){
            mc.dosome();
        }
        if (Thread.currentThread().getName().equals("t2")){
            mc.doOther();
        }
    }
}

class myclass {
//    出现在实例方法上，表示this
//    synchronized出现在静态方法上
    public synchronized static void dosome(){
        System.out.println("s begin");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("s over");
    }
    public synchronized static void doOther(){
        System.out.println("o begin");
        System.out.println("o over");
    }
}