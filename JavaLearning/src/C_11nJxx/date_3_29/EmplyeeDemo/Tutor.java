package C_11nJxx.date_3_29.EmplyeeDemo;

public class Tutor extends Teacher {
    private String concreteWork;

    public Tutor() {
    }

    public Tutor(int id, String name, String generalWork, String concreteWork) {
        super(id, name, generalWork);
        this.concreteWork = concreteWork;
    }

    public String getConcreteWork() {
        return concreteWork;
    }

    public void setConcreteWork(String concreteWork) {
        this.concreteWork = concreteWork;
    }

    @Override
    public void showConcreteWork(){
        System.out.println(this.getConcreteWork());
    }
}
