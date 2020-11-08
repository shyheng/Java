package 异常作业.数组作业;
/*
* 物资运输飞机，是武器，不能攻击，可以移动
* */
public class wuzhiji extends Weapon implements Moveable {
    @Override
    public void move() {
        System.out.println("走你");
    }
}
