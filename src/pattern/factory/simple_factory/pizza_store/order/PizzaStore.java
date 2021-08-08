package pattern.factory.simple_factory.pizza_store.order;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
        System.out.println("exit program~");
    }
}
