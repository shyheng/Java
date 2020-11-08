/*
源代码
public boolean equals(Object obj) {
        return (this == obj);
    }

   作用，目的
   判断两个对象是否相等

   默认的方法够不够用

 */
public class equals {
    public static void main(String[] args) {
//     绑定两个基本数据类型是否相等用双等号==
        int a = 100;
        int b = 100;
        System.out.println(a == b);//true 或者 false

//        判断两个java对象是否相等的用equals
        shy1 s1 = new shy1(2008, 8, 1);
        shy1 s2 = new shy1(2008, 8, 1);
//       这里的双等号判断是 内存地址 是不是一样 而不是对象
        System.out.println(s1 == s2);//false

//        重写object equals方法之前
        boolean b1 = s1.equals(s2);
        System.out.println(b1);//false
//        简写
        System.out.println(s1.equals(s2));

        //        在创建一个新的日期
        shy1 s3 = new shy1(2008,11,15);
        System.out.println(s1.equals(s3));//日期不相等是错

//        考虑传空,可以运行，效率低
        shy1 s4 = null;
        System.out.println(s1.equals(s4));
    }
}

//构造方法
class shy1 {
    int year;
    int month;
    int day;

    //无参
    public shy1() {

    }

    //有参
    public shy1(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //默认equals方法
    /*
public boolean equals(Object obj) {
        return (this == obj);
    }

 */
//重写object的equals方法
//    相同的返回值类型，相同的方法名，相同的形式参数列表


//equals方法
/*
    public boolean equals(Object obj) {//方法覆盖 必须Object obj
//    当年相同，月相同并且日也相同的时候
//    获取当前一个日期
        int year1 = this.year;
        int month1 = this.month;
        int day1 = this.day;
//    获取第二个日期，转型，obj转shy强制类型
        if (obj instanceof shy1){
//            强制类型装换
            shy1 t = (shy1) obj;
            int year2 = t.year;
            int month2 = t.month;
            int day2 = t.day;
            if (year1 == year2 && month1 == month2 && day1 ==day2){
                return true;
            }
        }

//    开始比对
    return false;
}
*/



//改良equals方法
/*
    public boolean equals(Object obj){
//        如果obj是空，直接放回false
        if (obj == null ){
            return false;
        }
//        如果obj不是一个shy1 没必要比较直接返回 （！表示不）
        if (! (obj instanceof shy1)){
            return false;
        }
//如果obj和this的内存地址相同 直接返回true
        if (this == obj){
            return true;
        }
//        运行到这说明obj是shy类型
//        直接转，不需要判断
        shy1 t = (shy1)obj;
        if (this.year == t.year && this.month == t.year && this.day == t.day){
            return true;
        }
//        最后返回false
        return false;
    }


 */

//第二次改良equals方法
/*
    public boolean equals(Object obj){
//        如果obj是空，直接放回false
    if (obj == null ){
        return false;
    }
//        如果obj不是一个shy1 没必要比较直接返回 （！表示不）
    if (! (obj instanceof shy1)){
        return false;
    }
//如果obj和this的内存地址相同 直接返回true
    if (this == obj){
        return true;
    }
//        运行到这说明obj是shy类型
//        直接转，不需要判断
    shy1 t = (shy1)obj;
    return this.year == t.year && this.month == t.year && this.day == t.day;



}


 */
}