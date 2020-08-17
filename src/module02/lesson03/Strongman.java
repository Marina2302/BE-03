package module02.lesson03;

public interface Strongman {
    default void drag() {
        System.out.println("Drags");
    }
}
