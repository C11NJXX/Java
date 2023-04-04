package c11njxx.learn.no1interfacedemo2;

public class PingPangCoach extends PingPangPractitioner implements Teach{
    public PingPangCoach() {
    }

    public PingPangCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("Teach player to play pingPang");
    }
}
