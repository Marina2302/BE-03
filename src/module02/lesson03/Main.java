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
}
