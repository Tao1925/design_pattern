package pattern.adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        System.out.println("class adapter mode");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
