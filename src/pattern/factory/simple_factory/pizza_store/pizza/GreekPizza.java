package pattern.factory.simple_factory.pizza_store.pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("为希腊披萨准备原材料");
    }
}
