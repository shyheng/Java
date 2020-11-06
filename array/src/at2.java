public class at2 {
    /*
    main方法中的[]有什么用
    jvm传回来0，不是null
    * */
    public static void main(String[] args) {
        System.out.println(args.length);
//        String[] st = new String[0];
        String[] st ={};
        shy(st);
//        这个数组是给用户的，可以在控制台上，这个参数会自动转换为String[] args
//        所以String[] args使用来接收用户的输入参数
//        遍历数组
        for (int i = 0; i< args.length;i++){
            System.out.println(args[i]);
        }
    }

    public static void shy(String[] args){
        System.out.println(args.length);//长度是0
    }
}
