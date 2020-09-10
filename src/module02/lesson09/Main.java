package module02.lesson09;

public class Main {
    public static void main(String[] args) throws Exception {
        Programmer programmer = new Programmer("Tomas", 32);
        Programmer.Stack stack = new Programmer.Stack(new String[]{"Java", "Spring", "Kotlin", "Postgresql", "Conspiracy theory"});

        programmer.analysis(stack);
    }
}
