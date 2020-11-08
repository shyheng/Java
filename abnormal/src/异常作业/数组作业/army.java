package 异常作业.数组作业;
/*
* 军队
* */
public class army {

    /*
   * 武器数组
   * */
    private Weapon[] weapons;
/*
* 创建军队的构造方法
* count 武器数量
* */
    public army(int count) {
//       动态初始化每一个元素默认值是null
//        武器数组是有了，但是没有武器
        weapons = new Weapon[count];
    }
/*
* 将武器加入数组
* */
    public void addWeapon(Weapon weapon) throws AddWeponException {
        for (int i = 0; i < weapons.length; i++) {
            if (null ==weapons[i]){
                weapons[i] = weapon;
                System.out.println(weapon +"添加成功");
                return;
            }
        }
//        程序如果到这说明，break;费了
throw new AddWeponException("武器已到上线");
    }

    /*
所有可攻击的武器
*/
    public void attackAll(){
//遍历weapons数组
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Shootable){
//                调用子类中特有的方法，向下转型
 /*类在强制类型转换过程中，如果是类转换成接口类型
那么类和接口之间不需要存在继承关系，也可以转换，java允许
*
* */
                Shootable shootable = (Shootable)weapons[i];//强制类型转换
                shootable.shoot();
            }
        }
    }

    /*
    * 所有可移动的武器
    * */
    public void moveAll(){
//遍历weapons数组
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] instanceof Moveable){
//                调用子类中特有的方法，向下转型
                Moveable moveable = (Moveable)weapons[i];
                moveable.move();
            }
        }
    }
}
