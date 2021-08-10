package pattern.decorator;

public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDes("milk");
        setPrice(2);
    }
}
