package 获取路径;

/**
 * 在bean中的
 * 获取绝对路径
 */
public class AbotPath {
    public static void main(String[] args) throws Exception{
//        这种方式的路径的缺点是，只能在IDEA运行，默认是Properties的根
//        离开了IDEA，路径无效
//        FileReader read = new FileReader("dd.Properties");

//        接下来的一种路径即使代码换了，这样编写仍然通用
//        前提在类路径下
//        就是在src是类路径的根路径

        /**
         * hread.currentThread() 当前线程
         * getContextClassLoader()是线程对象的方法，可以获取当前线程的类加载器对象
         *  getResource("") 这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源
         *
         */
        String pash = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo.Properties").getPath();

//        采用以上代码可以获取一个文件的绝对路径，以上代码绝对通用，前提在类路径下
        System.out.println(pash);


//        获取根目录下
        String pas = Thread.currentThread().getContextClassLoader()
                .getResource("验证反射机制的灵活性/dd.Properties").getPath();
        System.out.println(pas);
    }
}
