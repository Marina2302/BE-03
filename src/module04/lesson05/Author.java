package module04.lesson05;

public class Author {
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
}
