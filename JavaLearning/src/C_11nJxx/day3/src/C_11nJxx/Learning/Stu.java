package C_11nJxx.Learning;

public class Stu {
    private String name;
    private int age;
    private int id;


    public Stu() {
    }

    public Stu(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Stu{name = " + name + ", age = " + age + ", id = " + id + "}";
    }
}
