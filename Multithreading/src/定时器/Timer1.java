package 定时器;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 使用定时器 指定 定时任务
 */
public class Timer1 {
    public static void main(String[] args) throws Exception{

//        创建定时器对象
        Timer ti = new Timer();
//        Timer timer =new Timer(true);//线程守护

//        定时任务
//        ti.schedule(定时任务，第一次执行时间，间隔多久执行一次);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date fire = sdf.parse("2020-5-25 14:45:00");
//        ti.schedule(new log(),fire,1000*10);

//        可以使用匿名内部类
        ti.schedule(new TimerTask() {
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String str = sdf.format(new Date());
                System.out.println(str+"完成备份");
            }
        },fire,10000*10);
    }
}



//编写一个定时任务类
//假设是一个记录日志的定时任务
class log extends TimerTask{
    @Override
    public void run() {
//        编写需要执行的任务
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(new Date());
        System.out.println(str+"完成备份");
    }
}
