package principle.dependence_inversion;

public class DI1 {
    public static void main(String[] args) {
        DI1_Person person = new DI1_Person();
        person.receive(new DI1_Email());
    }
}

/*
* 完成了Person接收消息的功能
* 方式1分析：
*   1、简单，容易想到
*   2、如果我们获取的对象是微信，短信等，则需要新增类
*      同时Person也需要增加相应的接受方法
*   3、解决思路：引入一个抽象的接口IReceiver，表示
*      接收者，这样Person类与接口IReceiver发生依赖
*      因为Email，WeiXin等属于接收的范围，，他们
*      各自实现IReceiver接口就行，这样我们就符合
*      依赖倒转原则
* */
class DI1_Person{
    public void receive(DI1_Email email){
        System.out.println(email.getInfo());
    }
}

class DI1_Email{
    public String getInfo(){
        return "电子邮件信息：Hello,world!";
    }
}
