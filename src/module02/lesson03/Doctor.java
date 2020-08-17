package module02.lesson03;

public class Doctor extends Employee{
    private String name;
    private int age;

    public Doctor() {
    }

    public Doctor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void heal(){
        System.out.println("Heals");
    }

    @Override
    public void workInfo() {
        System.out.println("Some work");
    }
}
