public class at {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }

        int a2[] = {4, 2, 8};
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
//    调方法传一个数组
        int[] x = {1,2,3};
        pus(x);

//        创建string数组
        String[] strings = {"ss","ada","dd"};
        pus(strings);

//        动态
        String[] ss= new String[10];
        pus(ss);
        System.out.println("111111111111");
//       简写
        pus(new String[5]);
        System.out.println("sssssssssss");
        pus(new int[5]);

    }

    public static void pus(int[] array){
        for (int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void pus(String[] args){
        for (int i = 0; i<args.length;i++){
            System.out.println(args[i]);
        }
    }
}
