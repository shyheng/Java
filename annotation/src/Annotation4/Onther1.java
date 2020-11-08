package Annotation4;

/**
 * 数组和枚举在注解中，出现紫色就是枚举
 *
 *   大括号就是代表数组，紫色代表枚举
 */
public class Onther1 {
    @Onther(age = 10,ema = {"aljsl","slfj"},s = {sess.BLL})
    public void dosmr(){}

//    如果数组中只有一个元素，大括号可以不写
    @Onther(age = 10,ema = "sss",s = {sess.SHY,sess.BLL,sess.SSS})
    public void daover(){}
}
