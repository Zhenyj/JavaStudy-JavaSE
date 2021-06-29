package Section16Test.demo01.test;

import Section16Test.demo01.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author zyj
 * @create 2021-05-23 23:24
 *
 * 运行结果：
 * 绿色：成功
 * 红色：失败
 */
public class CalculatorTest01 {

  /**
   * 初始化方法
   *  用于申请资源，所有测试方法在执行之前都会先执行该方法
   */
  @Before
  public void init(){
    System.out.println("init...");
  }

  /**
   * 释放资源方法:
   * 在所有测试方法执行完后，都会自动执行该方法
   */
  @After
  public void close(){
    System.out.println("close...");
  }

  @Test
  public void addTest(){
    Calculator cal = new Calculator();
    int res = cal.add(1, 2);
    // 测试一般不用输出结果判断，用断言语句
//    System.out.println(res);
    /**
     * 断言语句中，使用期望值和实际值进行比较
     */
    Assert.assertEquals(3, res);

  }

  @Test
  public void subTest(){
    Calculator cal = new Calculator();
    int res = cal.sub(3,1);
    System.out.println("subTest...");
    Assert.assertEquals(2,res);
  }
}
