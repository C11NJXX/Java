package C_11nJxx.date_3_30.polymorphism;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String fodder) {
        System.out.println("Cat is eating" + fodder);
    }

    public void catchMouse() {
        System.out.println("Cat is catching mouse");
    }
}
