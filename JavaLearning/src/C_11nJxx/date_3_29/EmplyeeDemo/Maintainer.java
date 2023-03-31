package C_11nJxx.date_3_29.EmplyeeDemo;

public class Maintainer extends AdminStuff {
    private String concreteWork;

    public Maintainer() {
    }

    public Maintainer(int id, String name, String generalWork , String concreteWork) {
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
    public void showGeneralWork(){
        System.out.println(this.getConcreteWork());
    }
}
