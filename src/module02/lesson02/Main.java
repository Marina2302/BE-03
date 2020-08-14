package module02.lesson02;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Vaska", 3, "Pers");
        Cat cat2 = new Cat("Murzik", 4, "Brit");
        Cat cat3 = new Cat("Pushok", 2, "Burma");
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat3.toString());
    }
}
