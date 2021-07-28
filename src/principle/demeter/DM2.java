package principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class DM2 {

    public static void main(String[] args) {
        System.out.println("~~~使用迪米特法则的改进~~~");
        //创建了一个 SchoolManager 对象
        DM2_SchoolManager schoolManager = new DM2_SchoolManager();
        //输出学院的员工 id  和	学校总部的员工信息
        schoolManager.printAllEmployee(new DM2_CollegeManager());

    }
}




    //学校总部员工类
class DM2_Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//学院的员工类
class DM2_CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}

//管理学院员工的管理类
class DM2_CollegeManager {
    //返回学院的所有员工
    public List<DM2_CollegeEmployee> getAllEmployee() {
        List<DM2_CollegeEmployee> list = new ArrayList<DM2_CollegeEmployee>();

        for (int i = 0; i < 10; i++) {
            //这里我们增加了 10 个员工到 list
            DM2_CollegeEmployee emp = new DM2_CollegeEmployee();
            emp.setId("学院员工 id= " + i);
            list.add(emp);
        }
        return list;
    }

    // 输 出 学 院 员 工 的 信 息
    public void printEmployee() {
        //获取到学院员工
        List<DM2_CollegeEmployee> list1 = getAllEmployee();
        System.out.println("------------学院员工------------");
        for (DM2_CollegeEmployee e : list1) {
            System.out.println(e.getId());
        }
    }
}

//学校管理类
//分析 SchoolManager 类的直接朋友类有哪些 Employee、CollegeManager
//CollegeEmployee 不是 直接朋友 而是一个陌生类，这样违背了 迪米特法则
class DM2_SchoolManager {
    //返回学校总部的员工
    public List<DM2_Employee> getAllEmployee() {


        List<DM2_Employee> list = new ArrayList<DM2_Employee>();

        for (int i = 0; i < 5; i++) { //这里我们增加了 5 个员工到 list
            DM2_Employee emp = new DM2_Employee();
            emp.setId("学校总部员工 id= " + i); list.add(emp);
        }
        return list;
    }

    //该方法完成输出学校总部和学院员工信息(id)
    void printAllEmployee(DM2_CollegeManager sub) {

        //分析问题
        //1. 将输出学院的员工方法，封装到 CollegeManager
        sub.printEmployee();
        //获取到学校总部员工
        List<DM2_Employee> list2 = this.getAllEmployee();
        System.out.println("------------学校总部员工------------");
        for (DM2_Employee e : list2) {
            System.out.println(e.getId());
        }
    }
}
