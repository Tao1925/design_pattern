package pattern.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink order1 = new Americano();
        System.out.println("cost1="+order1.cost());
        System.out.println("des1="+order1.getDes());

        Drink order2 = new Milk(order1);
        System.out.println("cost2="+order2.cost());
        System.out.println("des2="+order2.getDes());

        Drink order3 = new Chocolate(order2);
        System.out.println("cost3="+order3.cost());
        System.out.println("des3="+order3.getDes());
    }
}
