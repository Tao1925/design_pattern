package pattern.factory.abstract_factory.pizza_store.order;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }
}
