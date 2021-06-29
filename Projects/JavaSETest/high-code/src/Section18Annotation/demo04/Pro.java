package Section18Annotation.demo04;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zyj
 * @create 2021-05-30 12:30
 *
 * 描述需要执行的类名和方法名
 */
@Target(value = {ElementType.TYPE})// 使用在类上
@Retention(RetentionPolicy.RUNTIME)// 保留在runtime阶段
public @interface Pro {
  String className();
  String methodName();
}
