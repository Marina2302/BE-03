package module02.lesson01;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    Person Sam = new Person("Sam", 15);
    Person Rik = new Person("Rik", 25);
    Person Nik = new Person("Nik", 20);
    Person Jon = new Person("Jon", 40);
    Person Jin = new Person("Jin", 35);
    Person Jak = new Person("Jak", 30);

    Person[] people = new Person[]{Sam, Rik, Nik, Jon, Jin, Jak};

    @org.junit.jupiter.api.Test
    public void sort() {
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(people));
        sortByName(people);
        sortByAge(people);
    }

    private static void sortByName(Person[] people) {
        Arrays.sort(people, Comparator.comparing(Person::getName));
        System.out.println("After sorting by name:");
        System.out.println(Arrays.toString(people));
    }

    private static void sortByAge(Person[] people) {
        Arrays.sort(people, Comparator.comparingInt(Person::getAge));
        System.out.println("After sorting by age:");
        System.out.println(Arrays.toString(people));

    }
}

