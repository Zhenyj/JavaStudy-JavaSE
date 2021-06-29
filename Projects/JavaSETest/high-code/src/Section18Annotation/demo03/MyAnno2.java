package Section18Annotation.demo03;

/**
 * @author zyj
 * @create 2021-05-27 20:57
 *
 * 自动以注解
 * public @interface 注解名称
 *
 * 本质：
 * 反编译MyAnno.class文件，本质上就是继承了java.lang.annotation.Annotation
 * public interface Section18Annotation.demo03.MyAnno extends java.lang.annotation.Annotation {}
 *
 * 属性:接口中的抽象方法
 * 本要求:
 * 1．属性的返回值类型
 * （1）基本数据类型
 * （2）String
 * （3）枚举
 * （4）注解
 * （5）以上类型的数组
 */
public @interface MyAnno2 {

}
