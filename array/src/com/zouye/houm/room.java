package com.zouye.houm;
/*酒店房间
* */
public class room {
/*
* 房间编号
*1楼
* 2楼
* 3楼
* */
    private int no;
/*   房间类型
*标准间，单人间，总统套房
* */
    private String type;
/*    房间是否空闲
*true空闲，可以预定
* false忙，不可预定
* */
    private boolean status;

    //构造方法无参
    public room() {
    }
    //有参
    public room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    //   get和set
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
//idea工具对于bool的类型变量，生成的get方法是isXxx（）
//    不喜欢改
   /* public boolean isStatus() {
        return status;
    }*/

   public boolean getStatus() {
    return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    //写了一个 类 都得 重写  下面两个，不重写继承的是Object
//    equals方法重写，比较
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof room)) return false;
        if (this==obj) return true;
        room a = (room)obj;
//        当前房间编号 等于 传过来的房间对象编号，为同一个房间。
        return this.getNo() == a.getNo();


    }



//    toString方法重写，转换成字符串 爱怎么,简单，明了，清晰
    public String toString(){
//       return "[101,单人间，空闲]";//写死了，把他转换为动态
//        动态，把一个变量添加到字符串当中，加一个双引号，双引号中间加两个加号，加变量名
//        status为三目运算
        return "["+no+","+type+","+(status ? "空闲" : "占用")+"]";

    }


    //测试main方法，用户删了
    public static void main(String[] args) {
        room a = new room(101,"单人间",true);
//        System.out.println(a.toString());
//        不加tostring()方法他自动调
        System.out.println(a);

        room a1 = new room(10,"单人间",true);
        System.out.println(a.equals(a1));
    }
}
//ctrl + f12 查找类