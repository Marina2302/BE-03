package module02.lesson02;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 3, "Pers");
        Cat cat2 = new Cat("Murzik", 4, "Brit");
        Cat cat3 = new Cat("Pushok", 2, "Burma");
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat3.toString());
        System.out.println();

        Human human1 = new Human("Petr");
        System.out.println(human1.hashCode());
        System.out.println();

        Dog dog1 = new Dog("Pupsik");
        Dog dog2 = new Dog("Mike");
        Dog dog3 = new Dog("Pupsik");
        System.out.println(dog1.equals(dog2));
        System.out.println(dog2.equals(dog3));
        System.out.println(dog3.equals(dog1));
    }
}
