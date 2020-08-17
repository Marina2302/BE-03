package module02.lesson03;

public class Builder extends Employee {
    private String name;
    private int age;

    public Builder() {
    }

    public Builder(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void build() {
        System.out.println("Builds");
    }

    @Override
    public void workInfo() {
        System.out.println("Some work");
    }
}
