package principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class DM1 {

    public static void main(String[] args) {
        //创建了一个 SchoolManager 对象
        DM1_SchoolManager dm1_schoolManager = new DM1_SchoolManager();
        //输出学院的员工 id 和学校总部的员工信息
        dm1_schoolManager.printAllEmployee(new DM1_CollegeManager());

    }

}

//学校总部员工类
class DM1_Employee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
}

//学院的员工类
class DM1_CollegeEmployee {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}



//管理学院员工的管理类
class DM1_CollegeManager {
    //返回学院的所有员工
    public List<DM1_CollegeEmployee> getAllEmployee() {
        List<DM1_CollegeEmployee> list =
                new ArrayList<DM1_CollegeEmployee>();
        for (int i = 0; i < 10; i++) { //这里我们增加了 10 个员工到 list
            DM1_CollegeEmployee emp = new DM1_CollegeEmployee();
            emp.setId("学院员工 id= " + i);
            list.add(emp);
        }
        return list;
    }
}

//学校管理类

//分析 SchoolManager 类的直接朋友类有哪些 Employee、CollegeManager
//CollegeEmployee 不是 直接朋友 而是一个陌生类，这样违背了 迪米特法则
class DM1_SchoolManager {
    //返回学校总部的员工
    public List<DM1_Employee> getAllEmployee() {
        List<DM1_Employee> list = new ArrayList<DM1_Employee>();
        for (int i = 0; i < 5; i++) { //这里我们增加了 5 个员工到 list
            DM1_Employee emp = new DM1_Employee();
            emp.setId("学校总部员工 id= " + i);
            list.add(emp);
        }
        return list;
    }

    //该方法完成输出学校总部和学院员工信息(id)
    //分析问题
    //1. 这 里 的  CollegeEmployee 不是	SchoolManager 的直接朋友
    //2. CollegeEmployee 是以局部变量方式出现在 SchoolManager
    //3. 违反了 迪米特法则
    void printAllEmployee(DM1_CollegeManager sub) {
    //获取到学院员工
    List<DM1_CollegeEmployee> list1 = sub.getAllEmployee();
    System.out.println("------------学院员工------------");
    for (DM1_CollegeEmployee e : list1) {
        System.out.println(e.getId());
    }
    //获取到学校总部员工
    List<DM1_Employee> list2 = this.getAllEmployee();
    System.out.println("------------学校总部员工------------");
    for (DM1_Employee e : list2) {
        System.out.println(e.getId());
    }
}
}
