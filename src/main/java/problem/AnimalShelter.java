package problem;

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
    interface Animal {

    }

    public class Cat implements Animal {

    }

    public class Dog implements Animal {

    }

    public void enqueue(Animal animal) {

    }

    public Animal dequeueAny() {
        return null;
    }

    public Cat dequeueCat() {
        return null;
    }

    public Dog dequeueDog() {
        return null;
    }
}
