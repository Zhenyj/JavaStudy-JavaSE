package demo02;

/**
 * @author zyj
 * @create 2021-05-30 20:54
 *
 * 封装Student的JavaBean
 */
public class Student {
  private String studentId;
  private String studentName;

  public Student() {
  }

  public Student(String studentId, String studentName) {
    this.studentId = studentId;
    this.studentName = studentName;
  }

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  @Override
  public String toString() {
    return "Student{" +
        "studentId='" + studentId + '\'' +
        ", studentName='" + studentName + '\'' +
        '}';
  }
}
