package Project02;

import java.util.ArrayList;

/**
 * @author zyj
 * @create 2021-03-19 16:50
 */
public class CustomerList {
    private static ArrayList<Customer> list = new ArrayList<>();

    private static int total = 0;

    //添加客户
    public boolean addCustomer(Customer customer) {
        try {
            list.add(customer);
            total+=1;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //修改客户信息
    public boolean replaceCustomer(int index, Customer customer) {
        if (list.size() == 0 || index < 0) {
            return false;
        }
        list.remove(index);
        list.add(index, customer);
        return true;
    }

    //删除客户
    public boolean deleteCustomer(int index) {
        if (list.size() == 0 || index < 0) {
            return false;
        }
        list.remove(index);
        total-=1;
        return true;
    }

    // 客户列表
    public ArrayList<Customer> getAllCustomers() {
        return list;
    }


    public Customer getCustomer(int index) {
        if (list.size() == 0 || index < 0) {
            return null;
        }
        return list.get(index);
    }

    //获取客户数量
    public int getTotal() {
        return total;
    }

}
