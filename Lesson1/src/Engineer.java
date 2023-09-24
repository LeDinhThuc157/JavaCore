public class Engineer extends Office {
    private String task;
    public Engineer(String name, int age, String sex, String address, String task) {
        super(name, age, sex,address);
        this.task = task;
    }
    @Override
    public String toString() {
        return "Engineer{" +
                "task='" + task + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
