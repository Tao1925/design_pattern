package principle.open_close;



public class OC1 {

    public static void main(String[] args) {
        // 使用看看存在的问题
        OC1_GraphicEditor oc1_graphicEditor = new OC1_GraphicEditor();

        oc1_graphicEditor.drawShape(new OC1_Rectangle());
        oc1_graphicEditor.drawShape(new OC1_Circle());
        oc1_graphicEditor.drawShape(new OC1_Triangle());
    }

}

/*
* 1、有点是比较好理解，简单易操作
* 2、缺点是违反了设计模式的OCP原则
* 3、当我们增加一个画三角形的功能时，我们需要在drawShape中
*    增加一个逻辑判断，要增加一个drawTriangle功能，还要
*    增加一个Triangle类，没有实现对修改封闭(使用方graphicEditor)
* */

//这是一个用于绘图的类 [使用方]
class OC1_GraphicEditor {
//接收 Shape 对象，然后根据 type，来绘制不同的图形
    public void drawShape(OC1_Shape s) {
        if (s.m_type == 1)
            drawRectangle(s);
        else if (s.m_type == 2)
            drawCircle(s);
        else if (s.m_type == 3)
            drawTriangle(s);
    }

    //绘制矩形
    public void drawRectangle(OC1_Shape r) {
        System.out.println("绘制矩形");
    }

    //绘制圆形
    public void drawCircle(OC1_Shape r) {
        System.out.println("绘制圆形");
    }

    //绘制三角形
    public void drawTriangle(OC1_Shape r) {
        System.out.println("绘制三角形");
    }
}

//Shape 类，基类
class OC1_Shape {
    int m_type;
}

class OC1_Rectangle extends OC1_Shape {
    OC1_Rectangle() {
        super.m_type = 1;
    }
}

class OC1_Circle extends OC1_Shape {
    OC1_Circle() {
        super.m_type = 2;
    }
}

//新增画三角形
class OC1_Triangle extends OC1_Shape {
    OC1_Triangle() {
        super.m_type = 3;
    }
}
