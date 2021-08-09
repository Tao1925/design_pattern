package pattern.adapter.class_adapter;

public class Phone {

    public void charging(I_Voltage5 i_voltage5){
        if (i_voltage5.output5() == 5){
            System.out.println("voltage is 5, can charge");
        }else{
            System.out.println("voltage not 5,can not charge");
        }
    }
}
