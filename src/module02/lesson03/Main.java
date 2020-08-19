package module02.lesson03;

public class Main {
    public static void main(String[] args) {
        Builder builder = new Builder("Bob", 45);
        Employee emb = new Builder("Tod", 23);
        Builder builder1 = new Builder("Kot", 40);
        Doctor doctor = new Doctor("Rob", 35);
        Employee emd = new Doctor("Bob", 50);
        Doctor doctor1 = new Doctor("Ted", 55);
        Programmer programmer = new Programmer("Mike", 25);
        Employee emp = new Programmer("Tod", 22);
        Programmer programmer1 = new Programmer("Gun", 27);

        builder.speak();
        builder.build();
        builder1.workInfo();
        emb.speak();
        doctor.speak();
        doctor.heal();
        doctor1.think();
        doctor.speak();
        emd.speak();
        emb.workInfo();
        programmer.speak();
        programmer.programming();
        programmer1.workInfo();
        programmer1.speak();
        emp.speak();
    }

/*Questions
Can an abstract class be instantiated? -- No

Is it possible to define a constructor for an abstract class? -- Yes

Can there be a non-abstract method in an abstract class? -- Yes

Can there be abstract and non-abstract methods in an abstract class? -- Yes

Can there be an abstract method in a non-abstract class? -- No

Can a non-abstract method be overridden? -- Yes

Are all methods of an interface abstract? -- No

Is it possible to create an interface without a method? -- Yes

What is the difference between an abstract class and an interface?
-- The abstract class is inherited and the interface is implemented.
Interface methods are implicitly abstract and cannot have implementations other than the default methods.
We inherit from only one class, but we can implement several interfaces.
An abstract class can have instance methods that implement default behavior.
Variables declared in a Java interface are final by default.
An abstract class can contain non-final variables.
Classes inherited from abstract classes have both a connection with their super-class (is a) and a lot in common between each other,
while implemented classes may not have such connections at all
*/
}
