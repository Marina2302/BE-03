package module02.lesson09;

public class Programmer {
    private String name;
    private int age;
    private Experience experience;

    private static class Experience {
        private static int summary;

        public Experience(int age) {
            this.summary = (age - 20) / 2;
        }
    }

    public static class Stack {
        private String[] skills;

        public Stack(String[] skills) {
            this.skills = skills;
        }
    }

    public Programmer(String name, int age) throws Exception {
        if (age < 20) {
            throw new Exception();
        }
        this.name = name;
        this.age = age;
        experience = new Experience(age);
        System.out.println("In the matrix there is a new programmer named " + name + ", he is " + age + " years old.");
        System.out.println("Approximate work experience - " + Experience.summary + " years.");
    }

    public void analysis(Stack stack) {
        if (stack.skills.length == 0) {
            System.out.println("Threat level: Is absent");
        }
        if (stack.skills.length > 0 && stack.skills.length <= 4) {
            System.out.println("Threat level: Weak");
        }
        if (stack.skills.length > 4 && stack.skills.length <= 8) {
            System.out.println("Threat level: Serious, establish surveillance!");
        }
        if (stack.skills.length > 8 && stack.skills.length <= 12) {
            System.out.println("Threat level: Dangerous, send Smith to him!");
        }
        if (stack.skills.length > 12) {
            System.out.println("Threat level: He is the chosen one...");
        }
    }
}
