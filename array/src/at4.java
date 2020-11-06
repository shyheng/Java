/*
一维数组的深入，数组的储存为：引用数据类型
对于数组中，实际java只能储存内存地址，每个元素只能是引用
* */
public class at4 {
    public static void main(String[] args) {
        int[] b = {1,23,13,3};
        for (int i = 0; i< b.length; i++){
           /* int b1 = b[i];
            System.out.println(b1);*/
            System.out.println(b[i]);
        }

        //        创建一个动物类型的数组
        animal a1 = new animal();
        animal a2 = new animal();
        animal[] animals = {a1,a2};

        //        对动物进行遍历
        for (int i = 0; i< animals.length; i++){
           /* animal a= animals[i];
            a.move();*/
//           代码合并
            animals[i].move();//这个move（）方法是动物对象的方法
        }

        animal[] a = new animal[4];
//        创建一个动物对象，放到盒子中
        a[0] =new animal();
//        a[1] = new shy();//必须要继承
        a[1] =new cat();
//创建一个动物类型，数组当存储cat和bird
        animal[] as = {new cat(), new bird()};//储存两个内存地址
        for (int i = 0 ; i < as.length; i++){
//            这样取是猫或者是鸟，肯定是动物
//            as[i]
            animal s = as[i];
            s.move();

//           调用子类方法的方法，需要向下转型， 特有方法判断是哪一个猫还是鸟
            if (as[i] instanceof cat){
//               强制类型装换
                cat c = (cat)as[i];
                c.mom();
            }else if (as[i] instanceof bird){
                bird n = (bird)as[i];
                n.sing();
            }
        }

    }
}
class animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class shy{

}
//继承
class cat extends animal{
    public void move() {
        System.out.println("猫走");
    }
//    特有的方法
    public void mom(){
        System.out.println("猫抓老鼠");
    }
}

class bird extends animal{
    public void move(){
        System.out.println("鸟飞");
    }
//特有方法
    public void sing(){
        System.out.println("鸟唱歌");
    }
}
