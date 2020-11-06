/*
在java开发中，数组满，一旦确定不可变，需要扩容
扩容：先建一个大容量数组，然后将小容量的数组拷贝到大容量中
所以数组扩容效率低，涉及到数组拷贝，
可以在创建数组对象的时候多长的，提高效率
* */
public class akouro {
    public static void main(String[] args) {
//        System.arraycopy(5个参数);
//       拷贝源
        int[] sre = {11,35,3,85,5};
//        拷贝目标位置
        int[] dae = new int[20];//初始化一个长度为20，每个元素为0

//        调用jdk的system的arraycopy方法，来完成数组的拷贝
//        System.arraycopy(sre,1,dae,3,2);

//        遍历目标数组
       /* for (int i = 0; i< dae.length; i++){
            System.out.println(dae[i]);//第三个开始
        }*/

       System.arraycopy(sre,0,dae,0,sre.length);
        for (int i = 0; i< dae.length; i++){
            System.out.println(dae[i]);//全部拷贝
        }


//        数组拷贝引用
        String[] s = {"ss","s","ff","sss","55"};
        String[] news = new String[20];
        System.arraycopy(s,0,news,0,s.length);
        for (int i = 0; i < news.length;i++){
            System.out.println(news[i]);
        }

        Object[] o = {new Object(),new Object(),new Object()};
        Object[] newo = new Object[7];
//        拷贝地址
        System.arraycopy(o,0,newo,0,o.length);
        for (int i = 0; i < newo.length; i++) {
            System.out.println(newo[i]);
        }
    }
}
