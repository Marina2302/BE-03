package module02.lesson01;

public class Cat {
    String name;
    int age;
    Breed breed;
    Person owner;

    public Cat() {
    }

    public Cat(String name, int age, Breed breed, Person owner) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.owner = owner;
    }

    public void print(){
        System.out.println("Cat{name='" + name + "', age=" + age + ", breed=" + breed + ", owner=Person{name='" + owner.getName() + "', age=" + owner.getAge() + "}}");
    }

    public enum Breed {
        SIAMESE,
        NEBELUNG,
        BIRMAN;
    }
}
