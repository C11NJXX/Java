package C_11nJxx.Learning;

public class StuTest {
    public static void main(String[] args) {
        Stu stu1 = new Stu();
        stu1.setAge(18);
        stu1.setId(1001);
        stu1.setName("Alan");
        System.out.println("age = " + stu1.getAge() + " name = " + stu1.getName() + " id = " + stu1.getId());
        System.out.println();
        System.out.println(stu1.toString());
    }

}
