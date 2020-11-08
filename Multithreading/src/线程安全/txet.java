package 线程安全;

public class txet {
    public static void main(String[] args) {
//        创建账户对象，只创建一个
        Account act = new Account("actt",10000);
//        创建两个线程
        Thread t = new AThread(act);
        Thread t1 = new AThread(act);

//        设置name
        t.setName("t");
        t1.setName("1t");

//        启动线程
        t.start();
        t1.start();
    }
}
