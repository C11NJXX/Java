package c11njxx.learn.no1interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog(3,"puppy");
        Frog frog = new Frog(1,"green");
        Rabbit rabbit = new Rabbit(2,"white");
        animalEat(dog);
        animalEat(frog);
        animalEat(rabbit);
        dog.swim();
        frog.swim();
    }

    public static void animalEat(Animal animal) {
        animal.eat();
    }
}
