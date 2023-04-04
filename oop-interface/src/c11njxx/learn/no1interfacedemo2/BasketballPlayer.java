package c11njxx.learn.no1interfacedemo2;

public class BasketballPlayer extends BasketballPractitioner implements Learn{
    public BasketballPlayer() {
    }

    public BasketballPlayer(int age, String name) {
        super(age, name);
    }

    @Override
    public void learn() {
        System.out.println("Learn to play basketball");
    }
}
