package 异常作业.数组作业;
/*
* 战斗机是武器，可移动，可攻击
* */
public class fightr extends Weapon implements Shootable,Moveable {
    @Override
    public void move() {
        System.out.println("战斗机起飞");
    }

    @Override
    public void shoot() {
        System.out.println("开炮");
    }
}
