package 常用类.随机数;

import java.util.Arrays;
import java.util.Random;

/*
* 编写程序，生成5个不重复的随机数(0-100)，重复重新生成
* 最终生成的5个随机数放到数组中，要求数组中这5个随机数不重复
*
* */
public class random2 {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        //创建random对象
        Random random = new Random();

//        准备一个长度为5的数组
        int[] arr = new int[5];//默认值都是0
        for (int i = 0; i < arr.length; i++) {
            arr[i]=-1;//每循环一次都是-1
        }
//        循环，生成随机数
        int index = 0;//下标
        while (index < arr.length){
//            int a = random.nextInt(101);
            int a = random.nextInt(5);//生成0-5
//            int a = random.nextInt(4);//死循环

            System.out.println("生成的随机数"+a);
//            判断arr数组有没有这个a
//            如果没有就放进去
            if (!shy(arr,a)){
                arr[index++] = a;//先赋值自加1，结束if就是++后的结果
            }

        }
//        遍历以上的数组
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        long end = System.currentTimeMillis();
        System.out.println("耗费时长"+(end -begin)+"毫秒");
    }

    /*单独编写一个方法，这个方法专门用来判断数组中是否包含某个元素
    arr数组
    key 元素
    true 表示包含
    false 表示不包含
     */
    public static boolean shy (int[] arr ,int key){
//对数组进行排序
//        Arrays.sort(arr);
//        进行二分法查找
//        二分法查找的结果，这个元素找到了，找到了，表示存在
//        return Arrays.binarySearch(arr,key) >= 0;
//
//有bug
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
//                条件成立了表示包含，返回true
                return true;
            }
        }
//        表示不包含
        return false;
    }

}
