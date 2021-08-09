package pattern.adapter.interface_adapter;

public class Client {
    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter() {
            //只需要去覆盖我们 需要使用 接口方法
            @Override
            public void m1() {
                System.out.println("使用了 m1 的方法");
            }
        };


        abstractAdapter.m1();

    }
}
