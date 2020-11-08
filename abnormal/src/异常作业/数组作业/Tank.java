package 异常作业.数组作业;

public class Tank extends Weapon implements Moveable,Shootable {

    @Override
    public void move() {
        System.out.println("坦克移动");
    }

    @Override
    public void shoot() {
        System.out.println("坦克开炮");
    }

}
