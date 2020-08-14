package module02.lesson02;

public class Human {
    private String name;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 10000 / 5 + 2 - 1;
    }
}
