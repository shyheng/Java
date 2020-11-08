/*
* finally语句
* */
public class Exception8 {
    public static void main(String[] args) {
        /*
        try和finally，没有catch可以吗、可以
        try不能单写
        以下代码的顺序
        先执行try
        在执行finally
        最后执行return
        * */
        try {
            System.out.println("r");
            return;
        }finally {
//            finally中的会执行
            System.out.println("f");
        }

//        System.out.println("hell");//无法执行，执行不到
    }
}
