public class mopao {
   /*
   * 冒泡排序
   * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
   * */
    public static void main(String[] args) {
        int[] a = {1,32,34,55,533,25,1};

       /* for (int i = 0; i < a.length-; a++) {
            System.out.println(i);

        }*/


//       冒泡排序
        int shy = 0;//比较次数
        int shy1 = 0;//比较交换次数
        for (int i = a.length-1; i >0; i--) {
//            拿出来比较
            for (int j = 0; j < i; j++) {
//       不管是否需要交换，都需要比较
                shy++;
                if ( a[j] > a[j+1] ){
//                    交换位置
                    int temp;
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    shy1++;
                }
            }
        }
        System.out.println("比较次数"+ shy);
        System.out.println("比较交换次数"+shy1);//9次
//输出结果
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
