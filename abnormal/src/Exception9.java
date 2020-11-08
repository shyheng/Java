public class Exception9 {
    public static void main(String[] args) {
        try {
            System.out.println("a");
//           退出jvm
            System.exit(0);//退出jvm，finally语句就不执行了
        }finally {
            System.out.println("b");
        }
    }
}
