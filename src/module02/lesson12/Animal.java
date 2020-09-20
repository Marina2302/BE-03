package module02.lesson12;

public class Animal {

    public void feed() {

        System.out.println("Animal.feed()");
    }
}

class Pet extends Animal {

    public void call() {

        System.out.println("Pet.call()");
    }
}

class Cat extends Pet {

    public void meow() {

        System.out.println("Cat.meow()");
    }
}

class Dog extends Pet {

    public void wouf() {

        System.out.println("Dog.wouf()");
    }
}
