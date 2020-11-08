package 常用类.随机数;

import java.util.Random;

/*
* 随机数
* */
public class random1 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();

        Random random = new Random();
//        随机产生int类型取值范围的数字
        int num1 = random.nextInt();
        System.out.println(num1);

//        产生0-100之间随机数，不能产生101
//        nextInt翻译为，下一个int是101，表示直到100
        int num2 = random.nextInt(101);//不包括101
        System.out.println(num2);

        long end = System.currentTimeMillis();
        System.out.println("耗费时长"+(end -begin)+"毫秒");
    }
}
