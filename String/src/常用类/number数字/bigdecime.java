package 常用类.number数字;

import java.math.BigDecimal;

/*
 * BigDecimal大数据，精度极高，不属于基本数据类型，属于java对象（引用数据类型）
 *
 * double不够用，专门用于财务软件
 *
 * java.math.BigDecimal
 *
 * */
public class bigdecime {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        //        精度极高的100
        BigDecimal v1 = new BigDecimal(100);
//        精度极高的200
        BigDecimal v2 = new BigDecimal(200);
//        求和
//        不是v1+v2。不能直接使用+
        BigDecimal v3 = v1.add(v2);//调用方法求和
        System.out.println(v3);//300

        BigDecimal v4 = v2.divide(v1);
        System.out.println(v4);
        long end = System.currentTimeMillis();
        System.out.println("耗费时长"+(end -begin)+"毫秒");
    }
}
