package 线程安全;

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
    public void withdraw(double money){
//        取款之前，读取之前的balance
        double begore = this.getBalance();
//        取款之后
        double after = begore-money;

//        在这个模拟网络延迟，100%出问题
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//        更新余额
//        更改set的balance值，调入取款之后的值
//        t执行到这里，但是还没有来得及执行者代码，t1线程进来withdraw方法此时一定出问题
        this.setBalance(after);
    }
}
