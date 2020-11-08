package 异常作业.数组作业;
/*
* 高射炮是武器，不能移动，只能攻击
* */
public class Gaoshepao extends Weapon implements Shootable {
    @Override
    public void shoot() {
        System.out.println("开炮");
    }
}
