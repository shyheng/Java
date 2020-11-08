/*
*
*java语言异常是以什么形式存在
* 1异常在java中以类的形式存在，每一个异常类都可以创建异常对信息。
*2异常对应的现实生活中是怎样？
*     火灾（异常类）：
*           2008年8月8日，小明家着火了（异常对象）
*           2008年8月9日，小刚家着火了（异常对象）
*           2008年9月8日，小红家着火了（异常对象）
*
*          类是：模板
*           对象是：实际存在的个体
*
*           钱包丢了（异常类）：
*             2008年1月8号，小明的钱包丢了（异常对象）
*             2008年1月9号，小方的钱包丢了（异常对象）
*
*
*
* *
* */


public class exception {
    public static void main(String[] args) {
//        通过异常类，实例化对象
        NumberFormatException nfe = new NumberFormatException("数字化异常");
        System.out.println(nfe);

//        通过异常类“创建：异常对象
        NullPointerException npe = new NullPointerException("空指针异常");
    }
}
