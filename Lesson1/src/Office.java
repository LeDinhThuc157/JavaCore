public class Office {
    protected String name;
    protected   int age;
    protected String sex;
    protected String address;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public Office(String name, int age, String sex, String address){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }
};

