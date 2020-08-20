package module02.lesson04;

public class AnotherClass {

    private static int count;

    public static void main(String[] args) {
        ClassWithPrivateVariables cwpv = new ClassWithPrivateVariables();
        cwpv.setName("Some");
        cwpv.setAge(5);
        cwpv.getName();
        cwpv.getAge();
        System.out.println();

        for (int i = 0; i < 3; i ++){
            System.out.println(new ClassWithPrivateVariables());
            count++;
        }
        System.out.println(count);

        System.out.println();
        Lion lion = new Lion();
        lion.setName("Lion");
    }
}
