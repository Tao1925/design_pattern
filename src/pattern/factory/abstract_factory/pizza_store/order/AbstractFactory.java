package pattern.factory.abstract_factory.pizza_store.order;

import pattern.factory.abstract_factory.pizza_store.pizza.Pizza;

public interface AbstractFactory {
    public Pizza createPizza(String orderType);
}
