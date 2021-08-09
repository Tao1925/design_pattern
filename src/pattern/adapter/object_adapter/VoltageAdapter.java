package pattern.adapter.object_adapter;



public class VoltageAdapter implements I_Voltage5 {

    private Voltage220 voltage220;

    public VoltageAdapter(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

    @Override
    public int output5() {
        int dst = 0;
        if (voltage220 != null){
            int src = voltage220.output220();
            System.out.println("use object adapter to convert");
            dst = src / 44;
            System.out.println("adapt complete, voltage = " + dst);
        }
        return dst;
    }
}
