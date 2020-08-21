package module02.lesson04;

public class Lion {
    private String name;

    public Lion() {
    }

    public Lion(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNewName(Lion lion){
        lion.name = "Lion1";
        System.out.println(lion.name);
    }
}
