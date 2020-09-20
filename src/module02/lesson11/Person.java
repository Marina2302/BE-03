package module02.lesson11;

import java.io.Serializable;

public class Person implements Serializable, Comparable {
    private String name;
    private int age;
    private String company;

//    public Person(String name, int age, String company) {
//        this.name = name;
//        this.age = age;
//        this.company = company;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
