package pattern.proxy.static_proxy;

public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("teacher is working.");
    }
}
