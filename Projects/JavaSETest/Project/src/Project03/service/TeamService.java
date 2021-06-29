package Project03.service;

import Project03.domain.Architect;
import Project03.domain.Designer;
import Project03.domain.Employee;
import Project03.domain.Programmer;

import java.util.Arrays;

/**
 * @author zyj
 * @create 2021-03-19 20:53
 */
public class TeamService {
    // memberId,自增
    private static Integer counter = 1;
    // 团队最大人员数量
    private final Integer MAX_MEMBER = 5;
    // 团队最大程序员人数
    private final Integer MAX_PROGRAMMER = 3;
    // 团队最大设计师人数
    private final Integer MAX_DESIGNER = 2;
    // 团队最大架构师人数
    private final Integer MAX_ARCHITECT = 1;
    // 团队成员对象数组
    private Programmer[] programmers = new Programmer[MAX_MEMBER];
    // 团队成员数量
    private static Integer total = 0;

    public TeamService() {
    }

    public Programmer[] getTeam(){
        return programmers;
    }

    public void addMember(Employee employee) throws TeamException{
        System.out.println(employee.getClass());
        if(total >= MAX_MEMBER){
            System.out.println("添加失败，原因：成员已满，无法添加");
            return;
        }
        if(employee.getClass().equals(Architect.class)){
            //架构师
            // 架构师人数限制
            int num = 0;
            for (int i = 0; i < total; i++) {
                if (programmers[i].getClass().equals(Architect.class)){
                    num++;
                }
            }
            if(num>=MAX_ARCHITECT){
                System.out.println("添加失败，原因：架构师人数已达上限");
                return;
            }
            // 向下转型
            Architect architect = (Architect)employee;
            String s = isFree(architect);
            if(s!=null){
                System.out.println("添加失败，原因："+s);
                return;
            }
            // 设置memberId
            architect.setMemberId(counter++);
            //添加到退队成员数组
            programmers[total++]=architect;
        }else if (employee.getClass().equals(Designer.class)){
            // 设计师
            // 设计师人数限制
            int num = 0;
            for (int i = 0; i < total; i++) {
                if (programmers[i].getClass().equals(Designer.class)){
                    num++;
                }
            }
            if(num>=MAX_DESIGNER){
                System.out.println("添加失败，原因：设计师人数已达上限");
                return;
            }
            Designer designer = (Designer)employee;
            // 是否在休假
            String s = isFree(designer);
            if(s!=null){
                System.out.println("添加失败，原因："+s);
                return;
            }
            // 设置memberId
            designer.setMemberId(counter++);
            //添加到退队成员数组
            programmers[total++]=designer;
        }else if(employee.getClass().equals(Programmer.class)){
            // 程序员
            // 程序员人数限制
            int num = 0;
            for (int i = 0; i < total; i++) {
                if (programmers[i].getClass().equals(Programmer.class)){
                    num++;
                }
            }
            if(num>=MAX_PROGRAMMER){
                System.out.println("添加失败，原因：程序员人数已达上限");
                return;
            }
            // 向下转型
            Programmer programmer = (Programmer)employee;
            // 判断员工状态
            String s = isFree(programmer);
            if(s!=null){
                System.out.println("添加失败，原因："+s);
                return;
            }
            // 设置memberId
            programmer.setMemberId(counter++);
            //添加到退队成员数组
            programmers[total++]=programmer;
        }else{
            System.out.println("该成员不是开发人员，无法添加");
        }
    }

    public boolean removeMember(Integer memberId) throws TeamException{
        Integer index = findIndexByMemberId(memberId);
        if(index!=-1){
            if(index==total-1){
                programmers[index] = null;
                total--;
                return true;
            }
            for (int j = index+1 ; j < total; j++) {
                programmers[j-1] = programmers[j];
            }
            total--;
            return  true;
        }
        System.out.println("删除失败，原因：没有找到该团队成员");
        return false;
    }

    public Integer findIndexById(Integer id){
        if(total==0){
            return -1;
        }
        for (Integer i = 0; i < total; i++) {
            if(programmers[i].getId()==id){
               return i;
            }
        }
        return -1;
    }

    public Integer findIndexByMemberId(Integer memberId){
        if(total==0){
            return -1;
        }
        for (Integer i = 0; i < total; i++) {
            if(programmers[i].getMemberId()==memberId){
                return i;
            }
        }
        return -1;
    }

    public String isFree(Programmer programmer){
        if(Status.BUSY.equals(programmer.getStatus().getNAME())){
            return "该员工已在开发团队中";
        }else if(Status.VOCATION.equals(programmer.getStatus().getNAME())){
            System.out.println("该员正在休假，无法添加");
        }
        return null;
    }

    public static Integer getCounter() {
        return counter;
    }

    public static void setCounter(Integer counter) {
        TeamService.counter = counter;
    }

    public Integer getMAX_MEMBER() {
        return MAX_MEMBER;
    }

    public Programmer[] getProgrammers() {
        return programmers;
    }

    public void setProgrammers(Programmer[] programmers) {
        this.programmers = programmers;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "TeamService{" +
                "MAX_MEMBER=" + MAX_MEMBER +
                ", MAX_PROGRAMMER=" + MAX_PROGRAMMER +
                ", MAX_DESIGNER=" + MAX_DESIGNER +
                ", MAX_ARCHITECT=" + MAX_ARCHITECT +
                ", programmers=" + Arrays.toString(programmers) +
                '}';
    }
}
