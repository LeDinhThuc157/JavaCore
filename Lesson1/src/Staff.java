public class Staff extends Office {
    private String task;
    public Staff(String name, int age, String sex, String address, String task) {
        super(name, age, sex, address);
        this.task = task;
    }
    @Override
    public String toString() {
        return "Staff{" +
                "task='" + task + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
