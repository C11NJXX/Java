package C_11nJxx.date_3_29.EmplyeeDemo;

public class Employee {
    private int id;
    private String name;


    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //方法
    public void showBasicInfo(){
        System.out.println(this.getId()+ " : " + this.getName());
    }
    //在子类中重写
    public void showGeneralWork(){
        System.out.println("Cultivating students");
    }
}
