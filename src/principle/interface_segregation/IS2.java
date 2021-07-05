package principle.interface_segregation;

public class IS2 {
    public static void main(String[] args) {
        IS2_A is2_a = new IS2_A();
        is2_a.depend1(new IS2_B());
        is2_a.depend2(new IS2_B());
        is2_a.depend3(new IS2_B());

        IS2_C is2_c = new IS2_C();
        is2_c.depend1(new IS2_D());
        is2_c.depend2(new IS2_D());
        is2_c.depend3(new IS2_D());

    }
}
/*
*
*
* */
interface Interface2_1{
    void operation1();
}
interface Interface2_2{
    void operation2();
    void operation3();
}
interface Interface2_3{
    void operation4();
    void operation5();
}
class IS2_B implements Interface2_1,Interface2_2 {

    @Override
    public void operation1() {
        System.out.println("IS2_B 实现了 operation1");
    }
    @Override
    public void operation2() {
        System.out.println("IS2_B 实现了 operation2");
    }
    @Override
    public void operation3() {
        System.out.println("IS2_B 实现了 operation3");
    }
}
class IS2_D implements Interface2_1,Interface2_3{

    @Override
    public void operation1() {
        System.out.println("IS2_D 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("IS2_D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("IS2_D 实现了 operation5");
    }
}

class IS2_A{
    public void depend1(Interface2_1 interface2_1){
        interface2_1.operation1();
    }
    public void depend2(Interface2_2 interface2_2){
        interface2_2.operation2();
    }
    public void depend3(Interface2_2 interface2_2){
        interface2_2.operation3();
    }
}

class IS2_C{
    public void depend1(Interface2_1 interface2_1){
        interface2_1.operation1();
    }
    public void depend2(Interface2_3 interface2_3){
        interface2_3.operation4();
    }
    public void depend3(Interface2_3 interface2_3){
        interface2_3.operation5();
    }
}
