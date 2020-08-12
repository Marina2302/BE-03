package module02.lesson01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

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

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
}
