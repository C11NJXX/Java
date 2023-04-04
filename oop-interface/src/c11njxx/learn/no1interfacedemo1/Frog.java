package c11njxx.learn.no1interfacedemo1;

public class Frog extends Animal implements Swim{

    public Frog() {
    }

    public Frog(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("Frog is hunting insects");
    }

    @Override
    public void swim() {
        System.out.println("Frog is swimming");
    }
}
