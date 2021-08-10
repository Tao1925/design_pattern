package pattern.decorator;

public class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDes("chocolate");
        setPrice(3);
    }
}
