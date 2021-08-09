package pattern.builder.old;

public class Client {

    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
        HighHouse highHouse = new HighHouse();
        highHouse.build();
    }

}
