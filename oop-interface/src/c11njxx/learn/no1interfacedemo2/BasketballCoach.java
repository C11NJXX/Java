package c11njxx.learn.no1interfacedemo2;

public class BasketballCoach extends BasketballPractitioner implements Teach{

    public BasketballCoach() {
    }

    public BasketballCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("Teach player to play basketball");
    }
}
