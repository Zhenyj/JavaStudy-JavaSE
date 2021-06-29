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
 * (1)TYPE:��������������
 * (2)METHOD�ÿ��������ڷ�����
 * (3)FIELD:���������ڳ�Ա������
 * *@Retention :����ע�ⱻ�����Ľ׶�
 * *@Documented:����ע���Ƿ񱻳�ȡ��api�ĵ���
 * *@Inherited:����ע���Ƿ�����̳�
 */
//@Target(value = {ElementType.TYPE})//��ʾ��ע��ֻ������������
@Target(value = {ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
//�Զ���ע��һ��ʹ��RUNTIME,��ʾ��������ע�⣬�ᱻ������class�ֽ����ļ��У�����JVM��ȡ��
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnno3 {

}
