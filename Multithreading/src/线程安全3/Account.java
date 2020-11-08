package 线程安全3;

/**
 * 银行账户
 *
 * 不使用线程同步机制，多线程对同一个账户进行取款，出现线程安全问题
 */
public class Account {
//    账号
    private String actno;
//    余额
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

//    取款的方法
//    实例方法上使用synchronized，锁的一定是this，没得挑
//    所以这种方式不灵活
//    还有一个缺点，就是整个方法体都必须同步，可能会扩大范围，导致程序的效率降低

//    优点代码少,简单

    /**
     * 如果共享的对象就是this,并且需要同步代码块
     *
     * eg 如果是局部变量,局部变量没有线程安全,使用StingBuild非线程安全
     * StringBuffer效率低
     *
     * ArrayLIst是非线程安全
     * Vector是线程安全
     * HashMap  HashSet是非线程安全
     * Hashtable是线程安全
     *
     * @param money
     */
    public synchronized void withdraw(double money){
        double begore = this.getBalance();
        double after = begore-money;
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setBalance(after);
    }
}
