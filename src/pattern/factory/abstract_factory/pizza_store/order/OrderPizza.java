package pattern.factory.abstract_factory.pizza_store.order;

import pattern.factory.abstract_factory.pizza_store.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    AbstractFactory abstractFactory;

    public OrderPizza(AbstractFactory abstractFactory){
        setAbstractFactory(abstractFactory);
    }

    public void setAbstractFactory(AbstractFactory abstractFactory) {
        Pizza pizza = null;
        String orderType = "";
        this.abstractFactory = abstractFactory;
        do {
            orderType = getType();
            pizza = abstractFactory.createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else{
                System.out.println("fail order");
                break;
            }
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
