package module02.lesson03;

public interface Intellectual {

    default void think() {
        System.out.println("Thinks");
    }
}
