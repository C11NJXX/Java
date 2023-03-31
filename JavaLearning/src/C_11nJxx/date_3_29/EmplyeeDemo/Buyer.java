package C_11nJxx.date_3_29.EmplyeeDemo;

public class Buyer extends AdminStuff{
    private String concreteWork;

    public Buyer() {
    }

    public Buyer(int id, String name, String generalWork, String concreteWork) {
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
