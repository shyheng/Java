package 常用类.枚举类;

public class SHY {
    public static void main(String[] args) {
        switch (sun.AUTUMN){
//            必须省略sun.
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
}
