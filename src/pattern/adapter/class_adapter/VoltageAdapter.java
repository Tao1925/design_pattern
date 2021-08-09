package pattern.adapter.class_adapter;

public class VoltageAdapter extends Voltage220 implements I_Voltage5{

    @Override
    public int output5() {
        int src = output220();
        int dst = src / 44;
        return dst;
    }
}
