package c11njxx.learn.no1interfacedemo1;

public abstract class Animal {
    private int age;
    private String name;

    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("age = " + this.getAge() + " name = " + this.getName());
    }

    public abstract void eat();// abstract way

}
