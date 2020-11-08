package 注解在开发中的作用;

import java.lang.reflect.Field;

public class txet {
    public static void main(String[] args) throws Exception {
//        获取类
        Class user = Class.forName("注解在开发中的作用.User");
//判断类上是否有Id注解
        boolean isRight = false;//给个默认标记
        if (user.isAnnotationPresent(Id.class)) {
//如果一个类上面有@ID注解的时候，要求类中必须存在int类型的ID属性
//            如果没有int类型的ID属性报异常
//            获取类的属性
            Field[] fields = user.getDeclaredFields();
            for (Field field : fields) {
                if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())) {
//                表示这个类是合法的类。有@Id注解，则这个类中必须有int类型的id属性
                    isRight = true;//表示合法
                    break;
                }
            }

//        判断是否合法
            if (!isRight) {
                throw new NotHasldException("要Id属性");
            }
        }
    }
}
