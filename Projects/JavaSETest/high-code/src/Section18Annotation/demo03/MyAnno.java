package Section18Annotation.demo03;

/**
 * @author zyj
 * @create 2021-05-27 20:57
 *
 * 自动以注解
 * public @interface 注解名称{
 * 属性方法
 * }
 *
 * 本质：
 * 反编译MyAnno.class文件，本质上就是继承了java.lang.annotation.Annotation
 * public interface Section18Annotation.demo03.MyAnno extends java.lang.annotation.Annotation {}
 *
 * 属性:接口中的抽象方法(为什么叫属性，因为在使用时要给属性赋值)
 * 要求:
 * 1．属性的返回值类型
 * （1）基本数据类型
 * （2）String
 * （3）枚举
 * （4）注解
 * （5）以上类型的数组
 * （6）void不行
 * 特点：
 * 1，如果定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不进行属性的赋值。
 * 2．如果只有一个属性需要赋值，并且属性的名称是value，则value可以省略，直接定义值即可
 * 3．数组赋值时，值使用{}包裹,如果数组只有一个值{}可以省略
 *
 * 元注解∶用于描逑注解的注解
 * *@Target :描述注解能够作用的位置
 * *@Retention :描述注解被保留的阶段
 * *@Documented:描述注解是否被抽取到api文档中
 * *@Inherited:描述注解是否被子类继承
 */
public @interface MyAnno {

  int age();

  String name() default "张三"; //default 设置默认值

  //
  Person per();

  //
  MyAnno2 anno2();

  //
  String[] strs();
}
