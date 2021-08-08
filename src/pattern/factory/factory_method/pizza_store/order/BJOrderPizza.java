package pattern.factory.factory_method.pizza_store.order;

import pattern.factory.factory_method.pizza_store.pizza.BJCheesePizza;
import pattern.factory.factory_method.pizza_store.pizza.BJPepperPizza;
import pattern.factory.factory_method.pizza_store.pizza.Pizza;

public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
