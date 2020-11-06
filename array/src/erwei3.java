//遍历二维数组
public class erwei3 {
    public static void main(String[] args) {
        String[][] a= {
                {"java","python","c++","c","php"},
                {"张","s","王","pu"},
                {"woc","we","e"}
        };
//        遍历二维数组
        for (int i = 0; i < a.length; i++) {//外层循环3次
            String[] b = a[i];
            for (int j = 0; j < b.length; j++) {
                System.out.println(b[j]);
            }
//            输出换行符
            System.out.println();

        }


        //        合并代码
        for (int i = 0; i < a.length; i++) {//外层循环3次
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }

            //            输出换行符
            System.out.println();
        }
    }
}
