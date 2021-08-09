package pattern.adapter.object_adapter;


public class Client {
    public static void main(String[] args) {
        System.out.println("object adapter mode");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220()));
    }
}
