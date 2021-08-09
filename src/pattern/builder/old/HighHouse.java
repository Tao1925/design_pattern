package pattern.builder.old;

public class HighHouse extends AbstractHouse {

    @Override
    public void buildBasic() {
        System.out.println(" 高层房子打地基 ");
    }

    @Override
    public void buildWalls() {
        System.out.println(" 高层房子砌墙 ");
    }

    @Override
    public void roofed() {
        System.out.println(" 高层房子封顶 ");
    }
}
