package module02.lesson08;

public class Heart {
    private int pulse;

    public Heart() {
    }

    public Heart(int pulse) {
        this.pulse = pulse;
    }

    @Override
    public String toString() {
        return "Heart{" +
                "pulse=" + pulse +
                '}';
    }
}
