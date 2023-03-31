package C_11nJxx.date_3_29.EmplyeeDemo;

public class Teacher extends Employee{
    private String generalWork;

    public Teacher() {
    }
    // 全部参数构造
    public Teacher(int id, String name, String generalWork) {
        super(id, name);
        this.generalWork = generalWork;
    }

    public String getGeneralWork() {
        return generalWork;
    }

    public void setGeneralWork(String generalWork) {
        this.generalWork = generalWork;
    }

    @Override
    public void showGeneralWork(){
        System.out.println(this.getGeneralWork());
    }

    public void showConcreteWork(){
        System.out.println("Teach students");
    }
}
