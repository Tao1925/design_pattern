package principle.single_responsibility;

public class SR3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.runRoad("摩托车");
        vehicle.runAir("飞机");
    }
}
// 方法3
// 1、这种修改方法没有对原来的类做大的修改，只是增加方法
// 2、这里虽然没有在类这个级别上遵守单一职责原则但是在方法
/*
* 方法3
* 1、这种修改方法没有对原来的类做大的修改，只是增加方法
* 2、这里虽然没有在类这个级别上遵守单一职责原则但是在方法
*    级别上，仍然是遵守单一变量原则
* */
class Vehicle2{
    public void runRoad(String vehicle){
        System.out.println(vehicle + "在路上运行");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle + "在空中运行");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle + "在水中运行");
    }
}