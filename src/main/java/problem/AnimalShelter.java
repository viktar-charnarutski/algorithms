package problem;

import java.util.LinkedList;
import java.util.Optional;

/**
 * Animal Shelter
 * <p>
 * An animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out" basis.
 * <p>
 * People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
 * or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of
 * that type).
 * They cannot select which specific animal they would like.
 * <p>
 * Create the data structures to maintain this system and implement operations such as:
 * <ul>
 * <li>enqueue</li>
 * <li>dequeueAny</li>
 * <li>dequeueDog</li>
 * <li>dequeueCat</li>
 * </ul>
 * <p>
 * You may use the built-in Linked list data structure.
 */
public class AnimalShelter {

    private LinkedList<Cat> cats;
    private LinkedList<Dog> dogs;

    public AnimalShelter() {
        cats = new LinkedList<>();
        dogs = new LinkedList<>();
    }

    public void enqueue(Animal animal) {
        if (animal instanceof Cat) {
            cats.push((Cat) animal);
        } else if (animal instanceof Dog) {
            dogs.push((Dog) animal);
        } else {
            throw new IllegalArgumentException("Unknown animal " + animal);
        }
    }

    public Optional<Animal> dequeueAny() {
        return cats.size() > dogs.size() ? dequeueCat() : dequeueDog();
    }

    public Optional<Animal> dequeueCat() {
        return cats.size() > 0 ? Optional.of(cats.pollFirst()) : Optional.empty();
    }

    public Optional<Animal> dequeueDog() {
        return dogs.size() > 0 ? Optional.of(dogs.pollFirst()) : Optional.empty();
    }

    interface Animal {
        String name();
    }

    public static class Cat implements Animal {

        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String name() {
            return name;
        }
    }

    public static class Dog implements Animal {
        private String name;

        public Dog(String name) {
            this.name = name;
        }

        @Override
        public String name() {
            return name;
        }
    }
}
