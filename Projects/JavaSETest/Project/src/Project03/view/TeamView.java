package Project03.view;

import Project03.domain.Architect;
import Project03.domain.Designer;
import Project03.domain.Employee;
import Project03.domain.NoteBook;
import Project03.domain.PC;
import Project03.domain.Printer;
import Project03.domain.Programmer;
import Project03.service.Data;
import Project03.service.NameListService;
import Project03.service.Status;
import Project03.service.TeamException;
import Project03.service.TeamService;

import java.time.temporal.Temporal;

/**
 * @author zyj
 * @create 2021-03-19 21:01
 */
public class TeamView {
    private static NameListService listSvc = new NameListService();

    private static TeamService teamService = new TeamService();

    public static void main(String[] args) {
        System.out.println("--------------------开发团队调度软件---------------------");
        listAllEmployees();
        enterMainMenu();
    }

    //public static void init() {
    //    Employee[] employees = new Employee[12];
    //    String[][] allEmployees = Data.EMPLOYEES;
    //    for (int i = 0; i < allEmployees.length; i++) {
    //        String[] temp = allEmployees[i];
    //        if (temp[0].equals(String.valueOf(Data.EMPLOYEE))) {
    //            employees[i] = new Employee(Integer.valueOf(temp[1]), temp[2],
    //                    Integer.valueOf(temp[3]), Double.valueOf(temp[4]));
    //        } else if (temp[0].equals(String.valueOf(Data.PROGRAMMER))) {
    //            //程序员
    //            employees[i] = new Programmer(Integer.valueOf(temp[1]), temp[2],
    //                    Integer.valueOf(temp[3]), Double.valueOf(temp[4]), 1, Status.FREE, new PC(Data.EQUIPMENTS[i][1], Data.EQUIPMENTS[i][2]));
    //        } else if (temp[0].equals(String.valueOf(Data.DESIGNER))) {
    //            //设计师
    //            employees[i] = new Designer(Integer.valueOf(temp[1]), temp[2],
    //                    Integer.valueOf(temp[3]), Double.valueOf(temp[4]), 1, Status.FREE,
    //                    new Printer(Data.EQUIPMENTS[i][1], Data.EQUIPMENTS[i][2]),
    //                    Double.valueOf(temp[5]));
    //        } else if (temp[0].equals(String.valueOf(Data.ARCHITECT))) {
    //            //架构师
    //            employees[i] = new Architect(Integer.valueOf(temp[1]), temp[2],
    //                    Integer.valueOf(temp[3]), Double.valueOf(temp[4]), 1, Status.FREE,
    //                    new NoteBook(Data.EQUIPMENTS[i][1], Double.valueOf(Data.EQUIPMENTS[i][2])),
    //                    Double.valueOf(temp[5]), Integer.valueOf(temp[6]));
    //        }
    //    }
    //    listSvc.setEmployees(employees);
    //}

    //主界面显示及控制方法
    public static void enterMainMenu() {
        System.out.print("1-团队列表\t2-添加团队成员\t3-删除团队成员\t4-员工列表\t5-退出\t请选择(1~5):");
        char selection = TSUtility.readMenuSelection();
        switch (selection) {
            case '1':
                getTeam();
                continueMenu();
                break;
            case '2':
                addMember();
                continueMenu();
                break;
            case '3':
                deleteMember();
                continueMenu();
                break;
            case '4':
                listAllEmployees();
                continueMenu();
                break;
            case '5':
                System.out.print("确认是否退出(Y/N):");
                char confirm = TSUtility.readConfirmSelection();
                if (confirm == 'Y') {
                    System.exit(0);
                } else {
                    continueMenu();
                }
                break;
            default:
                continueMenu();
                break;
        }
    }

    // 回车继续
    public static void continueMenu() {
        TSUtility.readReturn();
        enterMainMenu();
    }

    // 以表格形式列出公司所有成员
    private static void listAllEmployees() {
        System.out.println("ID\t姓名\t年龄\t工资\t\t职位\t状态\t奖金\t股票\t领用设备");
        Employee[] allEmployees = listSvc.getAllEmployees();
        for (Employee employee : allEmployees) {
            System.out.println(employee);
        }
        System.out.println("--------------------------------------------------------");
    }

    //显示限制数量团队成员列表操作
    private static void listAllEmployees(Integer limit) {
        System.out.println("ID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
        Employee[] allEmployees = listSvc.getAllEmployees();
        for (int i = 0; i < allEmployees.length && i < limit; i++) {
            System.out.println(allEmployees[i]);
        }
        if (allEmployees.length > limit) {
            System.out.println("......");
        }
        System.out.println("--------------------------------------------------------");
    }

    //显示团队成员列表操作
    private static void getTeam() {
        System.out.println(teamService);
        Programmer[] team = teamService.getTeam();
        int total = teamService.getTotal();
        if (total <= 0) {
            System.out.println("团队当前没有任何成员");
        } else {
            System.out.println("--------------------团队成员列表---------------------\n" +
                    "TID/ID\t姓名\t年龄\t工资\t\t职位\t奖金\t股票");
            for (int i = 0; i < total; i++) {
                System.out.println(team[i].teamToString());
            }
            System.out.println("--------------------------------------------------------");
        }

    }

    //实现添加成员操作
    private static void addMember() {
        System.out.print("请输入要添加的员工ID:");
        int id = TSUtility.readInt();
        // 是否在团队中
        if(teamService.findIndexById(id)!=-1){
            System.out.println("该员工已在本开发团队中");
            return;
        }
        // 获取员工信息添加到团队中
        Employee[] list = listSvc.getAllEmployees();
        for (Employee employee : list) {
            if (employee.getId() == id) {
                if (!(employee instanceof Programmer)) {
                    System.out.println("该成员不是开发人员，无法添加");
                    return;
                }
                try {
                    teamService.addMember(employee);
                    Programmer programmer = (Programmer) employee;
                    programmer.setStatus(Status.BUSY);
                    System.out.println("添加成功");
                    return;
                } catch (TeamException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("没有找到该员工");
    }

    //实现删除成员操作
    private static void deleteMember() {
        System.out.print("请输入要删除员工的TID:");
        int memberId = TSUtility.readInt();
        Integer index = teamService.findIndexByMemberId(memberId);
        if (index == -1) {
            System.out.println("团队中没有该成员");
            return;
        }
        System.out.print("确认是否删除(Y/N):");
        char confirm = TSUtility.readConfirmSelection();
        if (confirm == 'Y') {
            try {
                boolean b = teamService.removeMember(memberId);
                if (b) {
                    // 设置状态为FREE
                    Employee[] list = listSvc.getAllEmployees();
                    for (Employee employee : list) {
                        if (employee.getClass().equals(Employee.class)) {
                            continue;
                        }
                        if (employee.getClass().equals(Programmer.class)) {
                            Programmer programmer = (Programmer) employee;
                            if (programmer.getMemberId() == memberId) {
                                programmer.setStatus(Status.FREE);
                            }
                            continue;
                        } else if (employee.getClass().equals(Designer.class)) {
                            Designer designer = (Designer) employee;
                            if (designer.getMemberId() == memberId) {
                                designer.setStatus(Status.FREE);
                            }
                            continue;
                        } else if (employee.getClass().equals(Architect.class)) {
                            Architect architect = (Architect) employee;
                            if (architect.getMemberId() == memberId) {
                                architect.setStatus(Status.FREE);
                            }
                            continue;
                        }
                    }
                    System.out.println("删除成功");
                }
            } catch (TeamException e) {
                e.printStackTrace();
            }
        }
        continueMenu();
    }

    public static NameListService getListSvc() {
        return listSvc;
    }

    public static void setListSvc(NameListService listSvc) {
        TeamView.listSvc = listSvc;
    }

    public static TeamService getTeamService() {
        return teamService;
    }

    public static void setTeamService(TeamService teamService) {
        TeamView.teamService = teamService;
    }
}
