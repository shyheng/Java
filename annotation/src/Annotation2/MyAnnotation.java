package Annotation2;

public @interface MyAnnotation {
    /**
     * 我们可以在注解当中定义一个属性，以下是一个MyAnnotation的name属性
     * 看着像一个方法，但是我们实际称为属性
     * @return
     */
    String name();
    String col() default "";//属性默认值，可以不用写
    int age();
}
