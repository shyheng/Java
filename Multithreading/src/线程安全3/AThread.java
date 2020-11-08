package 线程安全3;

public class AThread extends Thread{
//    两个线程必须共享同一个账户对象
    private Account act;

//    通过构造方法传递过来对象
    public AThread(Account act){
        this.act = act;
    }

    public void run(){
//        run方法执行，表示取款操作
//        并发，t和t1是两个栈，两个栈操作堆中同一个对象
//        假设取款2000
        double moey = 5000;
//        取款
        act.withdraw(moey);
//        调取get账户和get余额
        System.out.println(Thread.currentThread().getName()+"对"+"账户"+act.getActno()+"对账户取款成功，还剩"+act.getBalance());
    }
}
