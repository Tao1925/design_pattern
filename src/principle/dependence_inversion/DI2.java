package principle.dependence_inversion;

import java.net.PortUnreachableException;

public class DI2 {
    public static void main(String[] args) {
        DI2_Person person = new DI2_Person();
        person.receive(new DI2_Email());
        person.receive(new DI2_WeiXin());
    }
}
class DI2_Person {
    public void receive(DI2_IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
interface DI2_IReceiver{
    public String getInfo();
}

class  DI2_Email implements DI2_IReceiver{

    @Override
    public String getInfo() {
        return "电子邮件信息：Hello,world!";
    }
}

class DI2_WeiXin implements DI2_IReceiver{

    @Override
    public String getInfo() {
        return "微信信息：Hello,world!";
    }
}