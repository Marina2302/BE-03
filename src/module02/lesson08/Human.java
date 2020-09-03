package module02.lesson08;

public class Human {
    private String name;

    private Heart heart;

    private Friend friend;

    public Human() {
    }

    public Human(String name, Friend friend) {
        this.name = name;
        heart = new Heart(70);
        this.friend = friend;
    }

    public Human(String name) {
        this.name = name;
        heart = new Heart(60);
        friend = new Friend();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", heart=" + heart +
                ", friend=" + friend +
                '}';
    }
}
