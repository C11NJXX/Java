package C_11nJxx.date_3_30.polymorphism;

public class Animal {
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void eat(String fodder){
        System.out.println("Animal is eating " + fodder);
    }
}
