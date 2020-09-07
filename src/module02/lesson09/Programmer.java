package module02.lesson09;

import java.util.ArrayList;
import java.util.Arrays;

public class Programmer {
    private String name;
    private int age;
    private Experience experience;

    private static class Experience {
        private int summary;

        public Experience(int age) {
            this.summary = (age - 20) / 2;
        }
    }

    public Programmer() {
    }

    public Programmer(String name, int age) {
        this.name = name;
        this.age = age;
        experience = new Experience(age);
    }

    public static class Stack {
        private ArrayList<String> skills;

    }

    public static void analysis(){

    }


    public static void main(String[] args) {

        Programmer programmer = new Programmer("Neo", 32);
        Programmer.Stack stack = new Programmer.Stack(Arrays.asList("Java", "Spring", "Kotlin", "Postgresql", "Conspiracy theory"));

        System.out.println(programmer.analysis(stack));
    }
}
