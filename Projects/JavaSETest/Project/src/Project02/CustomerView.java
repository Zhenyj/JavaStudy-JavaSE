package Project02;

import Project01.Utility;

import java.util.ArrayList;

/**
 * @author zyj
 * @create 2021-03-19 16:09
 */
public class CustomerView {

    private static CustomerList cl = new CustomerList();

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        System.out.print("-----------------客户信息管理软件-----------------" + "\n" +
                "\t\t\t\t 1 添加客户 \n" +
                "\t\t\t\t 2 修改客户 \n" +
                "\t\t\t\t 3 删除客户 \n" +
                "\t\t\t\t 4 客户列表 \n" +
                "\t\t\t\t 5 退\t出 \n\n" +
                "\t\t\t\t 请选择(1-5):");
        selectMenu();
    }

    private static void selectMenu() {
        char c = CMUtility.readMenuSelection();
        String name;
        char sex;
        int age;
        String tel;
        String email;
        Customer customer;
        switch (c) {
            case '1':
                System.out.println("---------------------添加客户---------------------");
                System.out.print("姓名:");
                name = CMUtility.readString(10);
                System.out.print("性别:");
                sex = CMUtility.readChar('男');
                System.out.print("年龄:");
                age = CMUtility.readInt();
                System.out.print("电话:");
                tel = CMUtility.readString(11);
                System.out.print("邮箱:");
                email = CMUtility.readString(20);
                customer = new Customer(name, sex, age, tel, email);
                boolean b = cl.addCustomer(customer);
                if(b){
                    System.out.println("---------------------添加完成---------------------");
                }else{
                    System.out.println("---------------------添加失败---------------------");
                }
                showMenu();
                break;
            case '2':
                System.out.print("请选择待修改客户编号(-1退出):");
                int index = CMUtility.readInt(-1);
                if(index!=-1){
                    Customer cu = cl.getCustomer(index-1);
                    if(cu==null){
                        System.out.println("错误:找不到该客户信息,当前客户数量为:"+cl.getTotal());
                    }else {
                        System.out.print("姓名(" + cu.getName() + "):");
                        name = CMUtility.readString(10, cu.getName());
                        System.out.print("性别(" + cu.getSex() + "):");
                        sex = CMUtility.readChar(cu.getSex());
                        System.out.print("年龄(" + cu.getAge() + "):");
                        age = CMUtility.readInt(cu.getAge());
                        System.out.print("电话(" + cu.getTel() + "):");
                        tel = CMUtility.readString(11, cu.getTel());
                        System.out.print("邮箱(" + cu.getEmail() + "):");
                        email = CMUtility.readString(20, cu.getEmail());
                        customer = new Customer(name, sex, age, tel, email);
                        b = cl.replaceCustomer(index-1, customer);
                        if(b){
                            System.out.println("---------------------修改成功---------------------");
                        }else{
                            System.out.println("---------------------修改失败---------------------");
                        }
                    }
                }
                showMenu();
                break;
            case '3':
                System.out.println("---------------------删除客户---------------------");
                System.out.print("请选择待删除客户编号(-1退出):");
                index = CMUtility.readInt(-1);
                if(index!=-1){
                    System.out.print("确认是否删除(Y/N):");
                    char confirm = CMUtility.readConfirmSelection();
                    if(confirm=='Y'){
                        b = cl.deleteCustomer(index - 1);
                        if(b){
                            System.out.println("---------------------删除完成---------------------");
                        }else{
                            System.out.println("---------------------删除失败---------------------");
                        }

                    }

                }
                showMenu();
                break;
            case '4':
                ArrayList<Customer> allCustomers = cl.getAllCustomers();
                if(allCustomers.size()==0){
                    System.out.println("系统当前没有任何客户信息");
                }else{
                    System.out.println("---------------------------客户列表---------------------------\n" +
                            "编号\t姓名\t性别\t年龄\t电话\t邮箱");
                    for (int i = 0; i < allCustomers.size(); i++) {
                        System.out.println(i+1+"\t"+allCustomers.get(i));
                    }
                    System.out.println("-------------------------客户列表完成-------------------------");
                }
                showMenu();
                break;
            case '5':
                System.out.print("确认是否退出程序(Y/N):");
                char confirm = CMUtility.readConfirmSelection();
                if(confirm=='Y'){
                    System.exit(0);
                    break;
                }
                showMenu();
                break;
            default:
                System.out.print("输入错误,请重新选择");
                selectMenu();
        }
    }
}
