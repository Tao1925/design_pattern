package principle.open_close;

public class OC2 {
    public static void main(String[] args) {
        OC2_GraphicEditor oc2_graphicEditor = new OC2_GraphicEditor();

        oc2_graphicEditor.drawShape(new OC2_Rectangle());
        oc2_graphicEditor.drawShape(new OC2_Circle());
        oc2_graphicEditor.drawShape(new OC2_Triangle());
    }
}

class OC2_GraphicEditor{
    public void drawShape(OC2_Shape s){
        s.draw();
    }
}

abstract class OC2_Shape{
    int m_type;
    public abstract void draw();
}

class OC2_Rectangle extends OC2_Shape {
    OC2_Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class OC2_Circle extends OC2_Shape {
    OC2_Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class OC2_Triangle extends OC2_Shape {
    OC2_Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
