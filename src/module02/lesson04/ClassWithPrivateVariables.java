package module02.lesson04;

public class ClassWithPrivateVariables {
    private String name;
    private int age;

    public ClassWithPrivateVariables() {
    }

    public ClassWithPrivateVariables(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
