package pattern.factory.simple_factory.pizza_store.pizza;

public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("为胡椒披萨准备原材料");
    }
}
