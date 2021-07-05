package principle.single_responsibility;

public class SR1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");// 飞机不能在路上跑
    }
}
/*
* 方式1
* 1、违反了单一职责原则
* 2、解决方案：根据交通工具不同分解成不同的类
* */
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在路上行驶...");
    }
}