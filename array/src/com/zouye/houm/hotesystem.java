package com.zouye.houm;

import java.util.Scanner;

/*java工程师，第一个小型项目
为某个酒店编写程序，酒店管理系统，模拟订房，退饭，打印所有房间状态等功能
1 该系统的用户是，酒店前台
2 酒店中使用一个二维数组来模拟
3 酒店中的每一个房间应该算是一个java对象：room
4 每个房间room都有：房间编号，房间类型属性，房间是否空闲
5 系统应该对外提供的功能
可以预定方法：用户输入房间号，订房
可以退房：用户输入房间编号，退房
可以查看所有房间的状态：用户输入某个指令应该可以查看所有房间状态


* */
public class hotesystem {
    public static void main(String[] args) {
//        创建酒店对象
        hote a = new hote();
//        a.print();

        /*首先输入欢迎页面*/
        System.out.println("欢迎使用，请认真阅读");
        System.out.println("请输入对应编号，1表示查看房间列表，2表示订房，3表示退房。0表示退出");

        Scanner s = new Scanner(System.in);

        while (true){
        System.out.print("请输入功能编号");
        int i = s.nextInt();


            if (i == 1){
//查看房间
            a.print();
            }else if (i==2){
//            订房
            System.out.println("请输入订房编号");
            int roonmno = s.nextInt();
            a.order(roonmno);
           }else if (i==3){
//            退房
            System.out.println("请输入退房编号");
            int roonmno = s.nextInt();
            a.exit(roonmno);
           }else if (i==0){
//            退出系统
            System.out.println("再见");
            return;
           }else {
//            瞎写
            System.out.println("输入有误，从新来");

            }

        }
    }
}
