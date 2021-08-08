package pattern.factory.simple_factory.pizza_store_old.order;

import pattern.factory.simple_factory.pizza_store_old.pizza.CheesePizza;
import pattern.factory.simple_factory.pizza_store_old.pizza.GreekPizza;
import pattern.factory.simple_factory.pizza_store_old.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            if(orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if (orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("芝士披萨");
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }

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
