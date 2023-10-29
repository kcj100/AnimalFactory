package rocks.zipcodewilmington;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    Dog dog;
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @BeforeEach
    public void setUp() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        dog = new Dog(givenName, givenBirthDate, givenId);
    }

    @Test
    void setNameTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog("", givenBirthDate, givenId);
        dog.setName(givenName);
        assertEquals(givenName, dog.getName());
    }

    @Test
    void setBirthDateTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Dog dog = new Dog("", new Date(), givenId);
        dog.setBirthDate(givenBirthDate);
        assertEquals(givenBirthDate, dog.getBirthDate());
    }

    @Test
    void speakTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Dog dog = new Dog("", givenBirthDate, givenId);
        assertEquals("bark!", dog.speak());
    }

    @Test
    void eatTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Dog dog = new Dog("", givenBirthDate, givenId);
        assertEquals(0, dog.getNumberOfMealsEaten());
        dog.eat(new Food());
        assertEquals(1, dog.getNumberOfMealsEaten());
    }

    @Test
    void getIdTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Dog dog = new Dog("", givenBirthDate, givenId);
        assertEquals(givenId, dog.getId());
    }

    @Test
    void testAnimalInheritance() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Dog dog = new Dog("", givenBirthDate, givenId);
        assertTrue(dog instanceof Animal);
    }

    @Test
    void testMammalInheritance() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Dog dog = new Dog("", givenBirthDate, givenId);
        assertTrue(dog instanceof Mammal);
    }

    @Test
    public void constructorTest() {
        // Given (dog data)

        // When (a dog is constructed)

        // When (we retrieve data from the dog)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        assertEquals(givenName, retrievedName);
        assertEquals(givenBirthDate, retrievedBirthDate);
        assertEquals(givenId, retrievedId);
    }
}
