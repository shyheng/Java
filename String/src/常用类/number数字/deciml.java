package 常用类.number数字;

import java.text.DecimalFormat;

/*
* 关于数字的格式化（了解）
* */
public class deciml {
    public static void main(String[] args) {
//        java.text.DecimalFormat专门负责数字格式化的
//        DecimalFormat df = new DecimalFormat("数字格式");
        /*
        * 数字格式有哪些
         # 代表任意数字
         ，千分位
         .小数点
         0 代表不够时补位
        *
        * */
        DecimalFormat df = new DecimalFormat("###,###.##");
//        String a = df.format(1234.56);
        String a = df.format(1234.561231);
        System.out.println(a);//1,234.56

        DecimalFormat da = new DecimalFormat("###,###.000");//不够补上0
        System.out.println(da.format(1234.56));//1,234.560

    }
}
