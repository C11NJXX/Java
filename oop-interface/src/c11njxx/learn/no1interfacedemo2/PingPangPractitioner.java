package c11njxx.learn.no1interfacedemo2;

public abstract class PingPangPractitioner extends Person{
    public PingPangPractitioner() {
    }

    public PingPangPractitioner(int age, String name) {
        super(age, name);
    }
    public void speakEng() {
        System.out.println("Learn to speak Eng");
    }

}
