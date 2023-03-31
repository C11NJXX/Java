package C_11nJxx.date_3_29.EmplyeeDemo;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Test");
        AdminStuff a1 = new AdminStuff(11,"Admin","管理学生事务");
        Teacher t1 = new Teacher(12,"Teacher","教学生");
        Lecture l1 = new Lecture(21,"Lecture","321321","llllll");
        Tutor t2 = new Tutor();
        Maintainer m1 = new Maintainer();
        Buyer b1 = new Buyer(3,"31","312","3123213213");
        e1.showBasicInfo();
        e1.showGeneralWork();
        a1.showBasicInfo();
        a1.showGeneralWork();
        t1.showBasicInfo();
        t1.showGeneralWork();
        t1.showConcreteWork();

    }
}
