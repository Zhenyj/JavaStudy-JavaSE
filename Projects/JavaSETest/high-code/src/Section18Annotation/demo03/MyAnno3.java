package Section18Annotation.demo03;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

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
 * (1)TYPE:可以作用于类上
 * (2)METHOD∶可以作用于方法上
 * (3)FIELD:可以作用于成员变量上
 * *@Retention :描述注解被保留的阶段
 * *@Documented:描述注解是否被抽取到api文档中
 * *@Inherited:描述注解是否被子类继承
 */
//@Target(value = {ElementType.TYPE})//表示该注解只能作用在类上
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
//自定义注解一般使用RUNTIME,表示被描述的注解，会被保留到class字节码文件中，并被JVM读取到
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnno3 {

}
