import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
*关于try。。catch中的finally子句
* 1 在finally子句中的代码是最后执行的，并且一定会执行，及时try语句块中
* 出现了异常
* finally子句必须和try一起出现，不能单写
*
* 2finally语句通常使用这在那些情况下
*finally通常在完成资源的释放、关闭
* 因为finally中的代码比较有保障
* 即使try语块中的代码出现异常。finally中也会正常执行
*
* */
public class Exception7 {
    public static void main(String[] args) {

        FileInputStream fls = null;//声明放在try外面，这样在finally中才能用
        try {
//            创建输入流对象
            fls = new FileInputStream("F:\\自动办公软件\\wry.txt");
//开始读文件

            String s = null;
//            这里一定会出现空指针异常
            s.toString();

//            流使用完需要关闭，因为流是占用资源的
//            即使以上程序出现问题，流也必须要关闭
//            放在这个可能流关不了，很危险
//            fls.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } catch (NullPointerException e){
            e.printStackTrace();
        }finally {
            System.out.println("哈");
            //            流放这好
//即使try中不执行，
            if (fls != null) {
                try {
//                    close()方法有异常捕捉
                    fls.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("h");
    }
}
