package module02.lesson03;

public abstract class Employee {
    private String name;
    private int age;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void speak() {
        System.out.println("Hi, my name is " + name + ". I'm " + age + " years old");
    }

    public abstract void workInfo();
}
