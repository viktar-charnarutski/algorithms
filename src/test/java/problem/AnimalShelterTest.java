package problem;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalShelterTest {

    private AnimalShelter shelter;

    @Before
    public void init() {
        shelter = new AnimalShelter();

        shelter.enqueue(new AnimalShelter.Cat("cat1"));
        shelter.enqueue(new AnimalShelter.Cat("cat2"));
        shelter.enqueue(new AnimalShelter.Cat("cat3"));
        shelter.enqueue(new AnimalShelter.Dog("dog1"));
        shelter.enqueue(new AnimalShelter.Dog("dog2"));
        shelter.enqueue(new AnimalShelter.Dog("dog3"));
    }

    @Test
    public void enqueue() {
        shelter.enqueue(new AnimalShelter.Dog("dog4"));
    }

    @Test
    public void dequeueAny() {
        AnimalShelter.Animal animal = shelter.dequeueAny().get();
        assertEquals("dog3", animal.name());
    }

    @Test
    public void dequeueCat() {
        AnimalShelter.Animal animal = shelter.dequeueCat().get();
        assertEquals("cat3", animal.name());
    }

    @Test
    public void dequeueDog() {
        AnimalShelter.Animal animal = shelter.dequeueDog().get();
        assertEquals("dog3", animal.name());
    }
}