package 常用类.日期处理;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
* 日期的处理
* 1怎么获取当前时间
* 2String--》Date
* 3Date --》String
*
* */
public class date {
    public static void main(String[] args) throws Exception{
//        获取当前时间(精确到毫秒的系统时间)
//        直接调用无参构造方法就行
        Date nowtaim =new Date();
//        System.out.println(nowtaim);//Tue Apr 28 21:23:21 CST 2020
//   日期格式化，
//        将日期类型Date，按照指定的格式进行转换，Date--> 转换成教育一定格式的日期字符串--》String
//       SimpleDateFormat是java。text包下的，专门负责日期格式化的
/*
* yyyy 年
* MM 月
* dd 日
* HH 时
* mm 分
* ss 秒
* SSS 毫秒
*
* 注意在日期格式中，除了y M d H m s S 这些字符不能随便写之外，剩下的符号格式自己随意组织
*
* */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM、yyyy");

        String no= sdf.format(nowtaim);
        System.out.println(no);

//        假设现在有日期字符串，怎么转Date类型
        String time = "2020-04-28 21:36:52 963";
//        日期要相同，不然出现异常java.text.ParseException
//        SimpleDateFormat sdf2 = new SimpleDateFormat("格式不能随便写，日期什么样就是什么样");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date d = sdf2.parse(time);//出现异常,main方法改
        System.out.println(d);

    }
}
