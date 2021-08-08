package pattern.factory.abstract_factory.pizza_store.order;

import pattern.factory.abstract_factory.pizza_store.pizza.Pizza;
import pattern.factory.abstract_factory.pizza_store.pizza.BJCheesePizza;
import pattern.factory.abstract_factory.pizza_store.pizza.BJPepperPizza;

public class BJFactory implements AbstractFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("Abstract Factory!");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
