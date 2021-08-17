package pattern.proxy.dynamic_proxy;

import pattern.proxy.dynamic_proxy.ITeacherDao;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("teacher is working.");
    }
}
