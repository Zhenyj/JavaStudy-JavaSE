package Section18Annotation.demo03;

/**
 * @author zyj
 * @create 2021-05-27 20:57
 *
 * �Զ���ע��
 * public @interface ע������{
 * ���Է���
 * }
 *
 * ���ʣ�
 * ������MyAnno.class�ļ��������Ͼ��Ǽ̳���java.lang.annotation.Annotation
 * public interface Section18Annotation.demo03.MyAnno extends java.lang.annotation.Annotation {}
 *
 * ����:�ӿ��еĳ��󷽷�(Ϊʲô�����ԣ���Ϊ��ʹ��ʱҪ�����Ը�ֵ)
 * Ҫ��:
 * 1�����Եķ���ֵ����
 * ��1��������������
 * ��2��String
 * ��3��ö��
 * ��4��ע��
 * ��5���������͵�����
 * ��6��void����
 * �ص㣺
 * 1�������������ʱ��ʹ��default�ؼ��ָ�����Ĭ�ϳ�ʼ��ֵ����ʹ��ע��ʱ�����Բ��������Եĸ�ֵ��
 * 2�����ֻ��һ��������Ҫ��ֵ���������Ե�������value����value����ʡ�ԣ�ֱ�Ӷ���ֵ����
 * 3�����鸳ֵʱ��ֵʹ��{}����,�������ֻ��һ��ֵ{}����ʡ��
 *
 * Ԫע�����������ע���ע��
 * *@Target :����ע���ܹ����õ�λ��
 * *@Retention :����ע�ⱻ�����Ľ׶�
 * *@Documented:����ע���Ƿ񱻳�ȡ��api�ĵ���
 * *@Inherited:����ע���Ƿ�����̳�
 */
public @interface MyAnno {

  int age();

  String name() default "����"; //default ����Ĭ��ֵ

  //
  Person per();

  //
  MyAnno2 anno2();

  //
  String[] strs();
}
