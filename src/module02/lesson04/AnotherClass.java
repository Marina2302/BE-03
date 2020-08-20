package module02.lesson04;

public class AnotherClass {
    public static void main(String[] args) {
        ClassWithPrivateVariables cwpv = new ClassWithPrivateVariables();
        cwpv.setName("Some");
        cwpv.setAge(5);
        cwpv.getName();
        cwpv.getAge();
    }
}
