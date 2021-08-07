package pattern.singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        System.out.println("双重检查");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }

}

class Singleton{

    private Singleton(){}

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题,
    // 同时解决懒加载问题
    //同时保证了效率, 推荐使用


    //  Java提供了volatile关键字来保证可见性
    //　当一个共享变量被volatile修饰时，它会保证修改的值会立即被更新到主存，
    // 当有其他线程需要读取时，它会去内存中读取新值。
    //　　而普通的共享变量不能保证可见性，因为普通共享变量被修改之后，
    // 什么时候被写入主存是不确定的，当其他线程去读取时，
    // 此时内存中可能还是原来的旧值，因此无法保证可见性。

    private static volatile Singleton instance;


    public static synchronized Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}