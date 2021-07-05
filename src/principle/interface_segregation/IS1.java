package principle.interface_segregation;

public class IS1 {
    public static void main(String[] args) {
        IS1_A is1_a = new IS1_A();
        is1_a.depend1(new IS1_B());
        is1_a.depend2(new IS1_B());
        is1_a.depend3(new IS1_B());

        IS1_C is1_c = new IS1_C();
        is1_c.depend1(new IS1_D());
        is1_c.depend2(new IS1_D());
        is1_c.depend3(new IS1_D());
    }
}
/*
* 这样子操作的话，B的operation4，5没有被使用到，D同理
* */
interface Interface1{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class IS1_B implements Interface1{

    @Override
    public void operation1() {
        System.out.println("IS1_B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("IS1_B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("IS1_B 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("IS1_B 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("IS1_B 实现了 operation5");
    }
}

class IS1_D implements Interface1{

    @Override
    public void operation1() {
        System.out.println("IS1_D 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("IS1_D 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("IS1_D 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("IS1_D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("IS1_D 实现了 operation5");
    }
}
// A类通过接口Interface1依赖(使用)B类，但是只会用到1，2，3方法
class IS1_A{
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void depend2(Interface1 interface1){
        interface1.operation2();
    }
    public void depend3(Interface1 interface1){
        interface1.operation3();
    }
}

// C类通过接口Interface1依赖(使用)D类，但是只会用到1，4，5方法
class IS1_C{
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void depend2(Interface1 interface1){
        interface1.operation4();
    }
    public void depend3(Interface1 interface1){
        interface1.operation5();
    }
}
