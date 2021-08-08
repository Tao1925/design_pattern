package pattern.factory.abstract_factory.pizza_store.order;

import pattern.factory.abstract_factory.pizza_store.pizza.*;

public class LDFactory implements AbstractFactory{
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("Abstract Factory!");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
