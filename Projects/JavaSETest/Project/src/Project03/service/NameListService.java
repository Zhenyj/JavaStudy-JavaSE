package Project03.service;

import Project03.domain.Architect;
import Project03.domain.Designer;
import Project03.domain.Employee;
import Project03.domain.NoteBook;
import Project03.domain.PC;
import Project03.domain.Printer;
import Project03.domain.Programmer;

/**
 * @author zyj
 * @create 2021-03-19 20:47
 */
public class NameListService {

    private Employee[] employees;

    public NameListService() {
        employees = new Employee[Data.EMPLOYEES.length];
        String[][] allEmployees = Data.EMPLOYEES;
        for (int i = 0; i < allEmployees.length; i++) {
            String[] temp = allEmployees[i];
            if (temp[0].equals(String.valueOf(Data.EMPLOYEE))) {
                employees[i] = new Employee(Integer.valueOf(temp[1]), temp[2],
                        Integer.valueOf(temp[3]), Double.valueOf(temp[4]));
            } else if (temp[0].equals(String.valueOf(Data.PROGRAMMER))) {
                //程序员
                employees[i] = new Programmer(Integer.valueOf(temp[1]), temp[2],
                        Integer.valueOf(temp[3]), Double.valueOf(temp[4]), 1, Status.FREE, new PC(Data.EQUIPMENTS[i][1], Data.EQUIPMENTS[i][2]));
            } else if (temp[0].equals(String.valueOf(Data.DESIGNER))) {
                //设计师
                employees[i] = new Designer(Integer.valueOf(temp[1]), temp[2],
                        Integer.valueOf(temp[3]), Double.valueOf(temp[4]), 1, Status.FREE,
                        new Printer(Data.EQUIPMENTS[i][1], Data.EQUIPMENTS[i][2]),
                        Double.valueOf(temp[5]));
            } else if (temp[0].equals(String.valueOf(Data.ARCHITECT))) {
                //架构师
                employees[i] = new Architect(Integer.valueOf(temp[1]), temp[2],
                        Integer.valueOf(temp[3]), Double.valueOf(temp[4]), 1, Status.FREE,
                        new NoteBook(Data.EQUIPMENTS[i][1], Double.valueOf(Data.EQUIPMENTS[i][2])),
                        Double.valueOf(temp[5]), Integer.valueOf(temp[6]));
            }
        }
    }

    public NameListService(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Employee getEmployee(Integer id) throws TeamException{
        return null;
    }

    //获取全部员工
    public Employee[] getAllEmployees(){
        return employees;
    }
}
