package 常用类.方法;

public class Stin {
    public static void main(String[] args) {
//        String类当中常用方法
//        1，（掌握） char charAt(int index);
        char c = "中国人".charAt(1);
        System.out.println(c);//国

//        2，（了解）int compareTo(String anotherString)

//        字符串之间比较大小不能用<> ,需要compareTo()方法

        int result = "abc".compareTo("abc");
        System.out.println(result);//0等于0，前后一致 10-10=0

        int result2 = "abcd".compareTo("abcde");
        System.out.println(result2);//-1 小于0 前小后大 8-9=-1

        int result3 = "abcde".compareTo("abcd");
        System.out.println(result3);//1 大于0 前大后小9-8=1
//拿着第一个字母和后面的字母比较，第一个有错就是-1
        System.out.println("xyz".compareTo("yxz"));

//        3 （掌握）boolean conains（CharSequence s）;
//        判断前面的字符串是否包含后面的子类字符串
        System.out.println("shy.java".contains(".java"));//true
        System.out.println("https://www.baidu.com".contains("https://"));//false

//        4 （掌握）boolean endsWith(String suffix)
//        判断当前字符串是否以某个字符串结尾
        System.out.println("test.txt".endsWith(".java"));//false
        System.out.println("test.txt".endsWith(".txt"));//true
        System.out.println("sjwoifsdnsaoiwj".endsWith("wj"));//true

//        5 (掌握) boolean equals（Object anObject）
//        比较两个字符串必须使用equals，不能使用==
        System.out.println("abc".equals("abc"));//true
//equals只能看出相等不相等
//equalsIgnoreCase是否相等，并且忽略大小写


//        6 （掌握）boolean equalsIgnoreCase(String anotherString)
//       判断两个字符串是否相等，并且忽略大小写
        System.out.println("ABc".equalsIgnoreCase("abC"));//true

//         7（掌握）byte[] getBytes()
//        将字符串装换为字节数组
        byte[] bytes = "abcdef".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

//        8(掌握) int indexOf(String str)
//        判断某个字符串在当前字符串中第一次出现的索引(下标)
        System.out.println("oraclejavac++.netc#phppython".indexOf("java"));//6

//        9(掌握) boolean isEmpty();
//        判断某个字符串是否为空,低层源代码调用的应该是字符串的length方法
       String s = "";
       String s1 = "a";
       System.out.println(s.isEmpty());//true
        System.out.println(s1.isEmpty());//false

//10 （掌握）int length();
//      面试题，判断数组长度和判断字符串长度不一样
//        判断数组长度是length属性（不要括号），判断字符串长度是length()方法
        System.out.println("abc".length());//3
        System.out.println("".length());//0

//        11（掌握）int lastIndexOf(String str)
//        判断某个字符串在当前字符串中最后一次出现的索引
        System.out.println("ojgksldjgownvskfjssjiejj".lastIndexOf("wn"));//10

//        12(掌握) String replace(CharSequence target , CharSequence replacement)
//替换
//        String的父类接口就是CharSequence
        String newString =  "http://www.baidu.com".replace("http://","https://");
        System.out.println(newString);
        String newString1 = "name=zhangs&id=1234s=20".replace("=",":");
        System.out.println(newString1);

//13（掌握）String[] split(String regex)
//        拆分字符串
        String[] nyr = "1980-10-1".split("-");//"1980-10-1"进行拆分
        for (int i = 0; i < nyr.length; i++) {
            System.out.println(nyr[i]);
        }

        String pa = "name=zhangs&id=1234s=20";
        String[] a = pa.split("&");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
//            可以继续拆分

        }

//        14 （掌握）boolean startsWith(String prefix)
//        判断某个字符串是否以当前字符串开始
        System.out.println("test.txt".startsWith("tes"));//true
        System.out.println("test.txt".startsWith(".t"));//false
        System.out.println("sjwoifsdnsaoiwj".startsWith("sd"));//false

//        15(掌握)String substring（int beginIndex）
//        截取字符串参数是截取下标
        System.out.println("http://www.baidu.com".substring(7));//www.baidu.com

//    16（掌握）String substring（int beginIndex, int endIndex）
//        beginIndex(包括)
//        endIndex（不包括）
        System.out.println("http://www.baidu.com".substring(7, 10));//www

//    17（掌握）char[] toCharArray()
//        将字符串转换成char数组
        char[] chars = "我是中国人".toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

//        18 (掌握) String toLowerCase()
//        转化为小写
        System.out.println("ASDFDSFss".toLowerCase());

//        19 (掌握) String toUpperCase()
//        全部大写
        System.out.println("lsjwinf".toUpperCase());

//        20 （掌握）String trim()
//        去除字符串前后空格,中间不会去
        System.out.println("   ssf   ssf   ".trim());

//        21（掌握）String 中只有一个方法是静态的，不需要new对象
//        这个方法叫valuOf
//        将“非字符串”转换为“字符串”
//        String s2 = String.valueOf(true);
//        String s2 = String.valueOf(100);
//        String s2 = String.valueOf(3.14);
        String s2 = String.valueOf(new Cus());//会自动调toString
        System.out.println(s2);//没有重写所以，出现内存地址，重写以后返回字符串
//        研究println方法
        System.out.println(200);
        System.out.println(3.14);
        System.out.println(true);

        Object obj = new Object();
//        为什么引用的时候要调用toString方法
        System.out.println(obj);//都是调toString
//        所以println在控制台上的都是字符串
//        本质是上System.out.println（）这个方法在输出任何数据的时候都是先转成字符串，在输出

    }
}

class Cus{
//重写toString方法

    @Override
    public String toString() {
        return "我是wip";
    }
}