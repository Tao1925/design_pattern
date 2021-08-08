package pattern.prototype.improve;



public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("原型模式完成对象的创建");

        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend = new Sheep("jack", 2, "黑色");

        Sheep sheep2 = (Sheep)sheep.clone(); //克隆
        Sheep sheep3 = (Sheep)sheep.clone(); //克隆

        System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());
        System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());
    }
}
