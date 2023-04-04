package c11njxx.learn.no1interfacedemo2;

public class PingPangPlayer extends PingPangPractitioner implements Learn{

    public PingPangPlayer() {

    }

    public PingPangPlayer(int age,String name) {
        super(age,name);
    }
    @Override
    public void learn() {
        System.out.println("learn to play pingPang");
    }
}
