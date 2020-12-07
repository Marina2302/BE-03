package module04.lesson05;

import java.io.Serializable;

public class Author implements Serializable {
    private String name;
    private int age;
    private transient String uniqueNum;

    public Author(String name, int age, String uniqueNum) {
        this.name = name;
        this.age = age;
        this.uniqueNum = uniqueNum;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUniqueNum() {
        return uniqueNum;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", uniqueNum='" + uniqueNum + '\'' +
                '}';
    }
}
