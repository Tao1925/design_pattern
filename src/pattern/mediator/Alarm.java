package pattern.mediator;


//具体的同事类
public class Alarm extends Colleague {

    //构造器
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        //在创建 Alarm 同事对象时，将自己放入到 ConcreteMediator 对象中[集合]
        mediator.Register(name, this);
    }


    public void SendAlarm(int stateChange) {
        SendMessage(stateChange);
    }


    @Override
    public void SendMessage(int stateChange) {
        // 调 用 的 中 介 者 对 象 的 getMessage
        this.GetMediator().GetMessage(stateChange, this.name);
    }


}
