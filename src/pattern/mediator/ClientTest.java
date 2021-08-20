package pattern.mediator;

public class ClientTest {


    public static void main(String[] args) {
        //创建一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建 Alarm  并且加入到	ConcreteMediator 对象的 HashMap
        Alarm alarm = new Alarm(mediator, "alarm");
        //创建了 CoffeeMachine 对象，并	且加入到	ConcreteMediator 对象的 HashMap
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "coffeeMachine");

        //创建  Curtains , 并	且加入到	ConcreteMediator 对象的 HashMap
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tV = new TV(mediator, "TV");

        //让闹钟发出消息
        alarm.SendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm.SendAlarm(1);
    }


}
