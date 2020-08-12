package module02.lesson01;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sam", 33);
        person.meditation();
        Person Stepan = new Person("Stepan", 30);
        Cat Murzik = new Cat("Murzik", 5, Cat.Breed.NEBELUNG, Stepan);
        Murzik.print();
    }
}
