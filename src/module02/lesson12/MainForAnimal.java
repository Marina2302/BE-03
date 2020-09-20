package module02.lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainForAnimal {
    public static void iterateAnimals(Collection<? extends Animal> animals) {
        for(Animal animal: animals) {
            System.out.println("Everything is still working!");
        }
    }

    public static void iterateAnimals1(Collection<? super Cat> animals) {
        for(int i = 0; i < animals.size(); i++) {
            System.out.println("Everything is still working!");
        }
    }

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet());
        pets.add(new Pet());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        iterateAnimals(animals);
        iterateAnimals(pets);
        iterateAnimals(cats);
        iterateAnimals(dogs);

        iterateAnimals1(animals);
        iterateAnimals1(pets);
        iterateAnimals1(cats);
        //iterateAnimals1(dogs); -- compilation error
    }
}
