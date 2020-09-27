package module02.lesson12;

public class Main {
    public static void main(String[] args) {
        ParameterizedClass<String, Integer, Double> ob = new ParameterizedClass();
        ParameterizedClass<Double, Integer, String> ob1 = new ParameterizedClass();
        ParameterizedClass<Integer, String, Double> ob2 = new ParameterizedClass();

        ob.get();
        ob1.get();
        ob2.get();
    }
}
