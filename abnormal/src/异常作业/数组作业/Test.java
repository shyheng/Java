package 异常作业.数组作业;
/*类在强制类型转换过程中，如果是类转换成接口类型
那么类和接口之间不需要存在继承关系，也可以转换，java允许
*
* */
public class Test {
    public static void main(String[] args) {
//        构建一个军队
        army a = new army(10);//4个武器
//        创建武器对象
        fightr fightr = new fightr();
        fightr fightr1 = new fightr();
        Tank tank = new Tank();
        wuzhiji w = new wuzhiji();
        Gaoshepao gaoshepao = new Gaoshepao();
//        添加武器
        try {
            a.addWeapon(fightr1);
            a.addWeapon(tank);
            a.addWeapon(fightr);
            a.addWeapon(w);
            a.addWeapon(gaoshepao);
        } catch (AddWeponException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
//        让所有可移动的移动
        a.moveAll();

//        让攻击的攻击
        a.attackAll();
    }

}
