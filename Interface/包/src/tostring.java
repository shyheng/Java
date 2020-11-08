/*
toString()方法
源代码
public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    默认实现
    类名@对象内存地址转换为十六进制的形式

    作用
   通过调用这个方法可以将“一个java对象”转换成“字符串表示形式”
 */
public class tostring{
    public static void main(String[] args) {
        shy s = new shy(1970,7,1);
//       一个日期对象转化为十六进制
        String s1 = s.toString();
//        shy重写toString（）方法之前
        System.out.println(s1);//shy@十六进制
//        shy类重写后1970年7月1日
        System.out.println(s1.toString());
        System.out.println(s1);
    }
}

class shy {
    int year;
    int month;
    int day;

    //无参
    public shy(){

    }
    //有参
    public shy(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
//    重写toString（）方法
//    简洁，可读性
//    只要你写toString，就得重写
public String toString(){
    return this.year + "年" +this.month +"月" +this.day + "日";
}

}
