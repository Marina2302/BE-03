package module02.lesson01;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Person {
    String name;
    int age;

    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void meditation(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE MMM dd HH:mm:ss yyyy");
        String formatDateTime = now.format(formatter);
        System.out.println("I think - it means I exist. (" + this.name + ") " + formatDateTime);
    }

    public static void main(String[] args) {
        Person person = new Person("Sam", 33);
        person.meditation();
        Person Stepan = new Person("Stepan", 30);
        Cat Murzik = new Cat("Murzik", 5, Cat.Breed.NEBELUNG, Stepan);
        Murzik.print();
    }

}
