package module02.lesson03;

public class Programmer extends Employee implements Intellectual {
    private String name;
    private int age;

    public Programmer() {
    }

    public Programmer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void programming(){
        System.out.println("Programming");
    }

    @Override
    public void workInfo() {
        System.out.println("Some work");
    }
}
