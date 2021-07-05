package principle.single_responsibility;

public class SR2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}
/*
* 方案2
* 1、遵守单一职责原则
* 2、但这样做的改动很大，既要分解类，也要分解客户端
* 3、改进：直接修改Vehicle类，改动的代码会比较少
* */
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在路上运行");
    }
}


class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在空中运行");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水中运行");
    }
}
