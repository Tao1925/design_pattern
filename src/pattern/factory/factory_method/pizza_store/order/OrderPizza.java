package pattern.factory.factory_method.pizza_store.order;

import pattern.factory.factory_method.pizza_store.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }

    abstract Pizza createPizza(String orderType);

    private String getType() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("input pizza type: ");
            String str = in.readLine();
            return str;
        } catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }
}
