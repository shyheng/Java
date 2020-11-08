package Field类;

import java.lang.reflect.Field;

/**
 * 必须掌握
 *     怎么通过反射机制访问一个java对象的属性
 *        给属性赋值set
 *        获取属性的值get
 */
public class Reflect7 {
    public static void main(String[] args) throws Exception{

//        不使用反射机制，获取对象的属性
        Student s = new Student();

//        给属性赋值
        s.no = 111;//三要素，给s对象no属性赋值111
//        第一  对象s
//        第二  no属性
//        第三  111

//        读取属性的值
        System.out.println(s.no);


//使用反射机制怎么去访问属性的对象
        Class c = Class.forName("Field类.Student");
        Object obj = c.newInstance();//obj就是Student对象（底层调用无参构造）

//        获取no属性
        Field noF = c.getDeclaredField("no");

//        给obj对象（Student对象）的no赋值
//        虽然使用反射机制，但是三要素缺一不可
//        要素一  obj对象
//        要素二  no属性
//        要素三  2222值
//注意  反射机制让代码复杂了，但是灵活

        noF.set(obj,2222);

//        读取属性的值
//        两要素，获取obj对象的no属性值
        System.out.println(noF.get(obj));

//        获取私有的值
        Field namef = c.getDeclaredField("name");
//        打破封装,可以访问任何，
        namef.setAccessible(true);

//        修改
        namef.set(obj,"jke");
//        获取
        System.out.println(namef.get(obj));
    }
}
