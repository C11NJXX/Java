package C_11nJxx.date_3_30.polymorphism;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String fodder) {
        System.out.println("Dog is eating" + fodder);
    }
    public void lookHome(){
        System.out.println("Dog is watching home");
    }
}
