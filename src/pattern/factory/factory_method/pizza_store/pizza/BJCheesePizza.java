package pattern.factory.factory_method.pizza_store.pizza;

public class BJCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("北京的奶酪匹萨");
        System.out.println("北京的奶酪匹萨 准备原材料");
    }
}
