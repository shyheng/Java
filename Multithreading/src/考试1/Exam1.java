package 考试1;

/**
 *doOther方法执行的时候需要等待dosome方法吗？
 *
 * 不需要，因为doOther()方法没有synchronized
 *  厕所有两个
 */
public class Exam1 {
    public static void main(String[] args) throws InterruptedException {
        myclass mc = new myclass();
        Thread t1 = new myThread(mc);
        Thread t2 = new myThread(mc);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}

class myThread extends Thread{
    private myclass mc;
    public myThread (myclass mc){
        this.mc = mc;
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
    public synchronized void dosome(){
        System.out.println("s begin");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("s over");
    }
    public void doOther(){
        System.out.println("o begin");
        System.out.println("o over");
    }
}