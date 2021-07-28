package principle.liskov_substitution;

public class LS2 {
    public static void main(String[] args) {
        LS2_A ls2_a = new LS2_A();
        System.out.println("11-3=" + ls2_a.func1(11, 3));
        System.out.println("1-8=" + ls2_a.func1(1, 8));
        System.out.println("-----------------------");
        LS2_B ls2_b = new LS2_B();
        // 因为B类不在继承A类，因此调用者不会认为func1是求减法了
        System.out.println("11+3=" + ls2_b.func1(11, 3));
        System.out.println("1+8=" + ls2_b.func1(1, 8));
        System.out.println("11+3+9=" + ls2_b.func2(11, 3));

        // 使用组合仍然可以使用到A类的方法
        System.out.println("11-3=" + ls2_b.func3(11,3));
    }
}

class LS2_Base{

}

class LS2_A extends LS2_Base{
    public int func1(int a, int b){
        return a - b;
    }
}

class LS2_B extends LS2_Base{
    // 如果B类需要使用到A的方法，我们采用组合的关系
    // 即在B类中包含有A类的对象
    private LS2_A ls2_a = new LS2_A();

    public int func1(int a, int b){
        return a + b;
    }
    public int func2(int a, int b){
        return func1(a, b) + 9;
    }
    // 仍然想用A的方法
    public int func3(int a, int b){
        return ls2_a.func1(a, b);
    }
}

