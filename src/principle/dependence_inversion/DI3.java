package principle.dependence_inversion;

public class DI3 {

    public static void main(String[] args) {
        // 通过接口传递实现依赖传递
        DI3_1_ChangHong di3_1_changHong = new DI3_1_ChangHong();
        DI3_1_OpenAndClose di3_1_openAndClose = new DI3_1_OpenAndClose();
        di3_1_openAndClose.open(di3_1_changHong);

        // 通过构造器进行依赖传递
        DI3_2_ChangHong di3_2_changHong = new DI3_2_ChangHong();
        DI3_2_OpenAndClose di3_2_openAndClose = new DI3_2_OpenAndClose(di3_2_changHong);
        di3_2_openAndClose.open();

        // 通过setter方法进行依赖传递
        DI3_3_ChangHong di3_3_changHong = new DI3_3_ChangHong();
        DI3_3_OpenAndClose di3_3_openAndClose = new DI3_3_OpenAndClose();
        di3_3_openAndClose.setTv(di3_3_changHong);
        di3_3_openAndClose.open();
    }
}

// 方式 1： 通过接口传递实现依赖
// 开关的接口
interface DI3_1_IOpenAndClose {
    public void open(DI3_1_ITV tv); //抽象方法,接收接口
}

interface DI3_1_ITV { //ITV 接口
    public void play();
}
// 实现接口
class DI3_1_OpenAndClose implements DI3_1_IOpenAndClose{
    public void open(DI3_1_ITV tv){
        tv.play();
    }
}
class DI3_1_ChangHong implements DI3_1_ITV {
    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}

// 方式 2: 通过构造方法依赖传递
interface DI3_2_IOpenAndClose {
    public void open(); //抽象方法
}

interface DI3_2_ITV { //ITV 接口
    public void play();
}

class DI3_2_OpenAndClose implements DI3_2_IOpenAndClose{
    public DI3_2_ITV tv; //成员
    public DI3_2_OpenAndClose(DI3_2_ITV tv){ //构造器
        this.tv = tv;
    }
    public void open(){
        this.tv.play();
    }
}

class DI3_2_ChangHong implements DI3_2_ITV {
    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}

// 方式3,通过setter方法传递
interface DI3_3_IOpenAndClose {
    public void open();
    public void setTv(DI3_3_ITV tv);
}

interface DI3_3_ITV { // ITV 接口
    public void play();
}

class DI3_3_OpenAndClose implements DI3_3_IOpenAndClose {
    private DI3_3_ITV tv;
    public void setTv(DI3_3_ITV tv) {
        this.tv = tv;
    }
    public void open() {
        this.tv.play();
    }
}

class DI3_3_ChangHong implements DI3_3_ITV {
    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }
}
