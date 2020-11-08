package Class类;

/**
 * 研究  Class.forName()发生了什么
 *
 *   重点
 *      如果只是希望一个类的静态代码块执行，其他一不执行
 *         可以使用
 *         Class.forName("完整类名");
 *         类加载时，静态代码块执行
 *
 *   提示后面JDBC技术的时候我们还需要
 */
public class Reflect4 {
    public static void main(String[] args) {
        try {
//            Class.forName()会导致：类加载
            Class.forName("Class类.myclass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
