package pattern.factory.simple_factory.pizza_store.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("为芝士披萨准备原材料");
    }
}
