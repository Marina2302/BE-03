package module02.lesson08;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Rob");
        Friend friend = new Friend("Stive", 20);

        Human human1 = new Human("Ted", friend);

        System.out.println(human);
        System.out.println(human1);
        human.setFriend(friend);
        System.out.println(human);
    }
}
