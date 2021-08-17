package pattern.template;

public class Client {

    public static void main(String[] args) {

        System.out.println("----制作红豆豆浆----");
        SoyMilk redBeanSoyMilk = new RedBeanSoyMilk();
        redBeanSoyMilk.make();

        System.out.println("---- 制 作 花 生 豆 浆 ----");
        SoyMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();

    }

}
