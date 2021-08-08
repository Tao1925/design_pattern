package pattern.factory.abstract_factory.pizza_store.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的胡椒匹萨");
        System.out.println("伦敦的胡椒匹萨 准备原材料");
    }
}
