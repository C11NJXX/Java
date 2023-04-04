package c11njxx.learn.no1interfacedemo1;

public class Dog extends Animal implements Swim{

    public Dog() {
    }

    public Dog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bones");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }
}
