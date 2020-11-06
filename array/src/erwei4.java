/*
动态初始化二维
*/

public class erwei4 {
    public static void main(String[] args) {
//        3行4列
        int[][] array = new int[3][4];
//        二维数组遍历
   /*     for (int i = 0; i < a.length; i++) {//循环3次
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }*/
   int[][] a = {
           {1,2,3},
           {4,5,6},
           {7,8,9},
   };
          shy(a);

          shy(new int[][]{{100,200,300},
                  {10,20,30},
                  {0,1,2}});

    }



    public static void shy(int[][] array){
        for (int i = 0; i < array.length; i++) {//循环3次
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

