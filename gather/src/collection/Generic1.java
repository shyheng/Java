package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* 1jdk5.0之后推出泛型
*
* 2泛型这种机制，只在程序编译阶段起作用，只是给编译器参考的（运行阶段泛型没用）
*
* 3 泛型好处
* 第一 集合中存储的元素类型统一了
* 第二 从集合中取出的元素类型是泛型指定的类型，不需要强制类型
*
* 4泛型的缺点
*  导致集合中存储的元素缺乏多样性
* 大多数业务，集合中的元素的类型还是统一的，所以这种泛型特性被大家认可
*
* */
public class Generic1 {
    public static void main(String[] args) {
/*//不使用泛型，分析程序存在的缺点
        List my = new ArrayList();
//        准备对象
        Cat c = new Cat();
        Bird b = new Bird();
//        将对象添加到集合中
        my.add(c);
        my.add(b);

//        遍历集合，取出move方法
        Iterator it = my.iterator();
        while (it.hasNext()){
//            没有这个语法，通过迭代器取出就是Object
//            Animal a =it.next();
            Object o = it.next();

//            o中没有move方法，无法调用，需要向下转型
            if (o instanceof Animal){
                Animal a= (Animal) o;
                a.move();
            }

        }*/


//使用泛型
//        使用泛型List<Animal>之后，
//        表示List集合中只允许存储Animal类型的数据
//        用泛型来指定集合中的数据类型
        List<Animal> my = new ArrayList<Animal>();

//        指定List集合中只能储存Animal，那么储存String就错误
//        用了泛型之后，集合中的数据类型更加统一
//        my.add("abc");
        Cat c = new Cat();
        Bird b = new Bird();
        my.add(c);
        my.add(b);

//        获取迭代器
//        这个表示迭代器迭代的是Animal类型
        Iterator<Animal> it = my.iterator();
        while (it.hasNext()){
//            使用泛型之后，每一次迭代返回都是Animal类型
//            Animal a = it.next();
//            System.out.println(a);
//            a.move();

//            调用子类型特有的方法还是需要向下装换的
            Animal a1 = it.next();
            if (a1 instanceof Cat){
                Cat cat = (Cat)a1;
                cat.catMouse();
            }
            if (a1 instanceof Bird){
                Bird bird = (Bird)a1;
                bird.fly();
            }
        }
    }
}

class Animal{
public void move(){
    System.out.println("动物走");
}
}

class Cat extends Animal{
    public void catMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟在飞");
    }
}

