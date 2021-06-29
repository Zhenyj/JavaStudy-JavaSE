package Section18Annotation.demo03;

/**
 * @author zyj
 * @create 2021-05-27 23:14
 */

@MyAnno(age = 1,anno2 = @MyAnno2,per = Person.P1,strs = {"abc","def"})
@MyAnno3
public class Worker {
  @MyAnno3
  public String name="aaa";

  @MyAnno3
  public  void show(){}
}
