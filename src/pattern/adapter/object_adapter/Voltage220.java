package pattern.adapter.object_adapter;

public class Voltage220 {
    public int output220(){
        int src = 220;
        System.out.println("Voltage = " + src);
        return src;
    }
}
