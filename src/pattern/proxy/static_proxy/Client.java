package pattern.proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();

        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        teacherDaoProxy.teach();
    }
}
