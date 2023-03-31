package C_11nJxx.date_3_30.polymorphism;

public class polymorphismTest {
    public static void main(String[] args) {
        Person Keeper = new Person("张三",28);
        //用父类类型的引用数据类型接收子类对象，其实是发生了向上转型
        Animal a1 = new Cat(3,"black and white");
        Animal a2 = new Dog(3,"yellow");
        Keeper.keepPet(a1,"fish");
        Keeper.keepPet(a2,"bone");
        //向下转型（强制类型转换）（即从父类转到子类，从而实现子类特有的方法）
        if(a1 instanceof Cat cat){
            cat.catchMouse();
        }
        if(a2 instanceof Dog dog){
            dog.lookHome();
        }
    }
}
