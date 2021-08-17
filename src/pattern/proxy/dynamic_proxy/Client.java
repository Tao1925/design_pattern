package pattern.proxy.dynamic_proxy;

public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();

        ITeacherDao proxtInstance = (ITeacherDao)
                new ProxyFactory(target).getProxyInstance();
        System.out.println("proxyInstance = " + proxtInstance.getClass());

        proxtInstance.teach();
    }
}
