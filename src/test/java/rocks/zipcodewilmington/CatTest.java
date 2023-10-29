package rocks.zipcodewilmington;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    Cat cat;
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
        cat = new Cat(givenName, givenBirthDate, givenId);
    }

    @Test
    void setNameTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat("", givenBirthDate, givenId);
        cat.setName(givenName);
        assertEquals(givenName, cat.getName());
    }

    @Test
    void setBirthDateTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Cat cat = new Cat("", new Date(), givenId);
        cat.setBirthDate(givenBirthDate);
        assertEquals(givenBirthDate, cat.getBirthDate());
    }

    @Test
    void speakTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Cat cat = new Cat("", givenBirthDate, givenId);
        assertEquals("meow!", cat.speak());
    }

    @Test
    void eatTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Cat cat = new Cat("", givenBirthDate, givenId);
        assertEquals(0, cat.getNumberOfMealsEaten());
        cat.eat(new Food());
        assertEquals(1, cat.getNumberOfMealsEaten());
    }

    @Test
    void getIdTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Cat cat = new Cat("", givenBirthDate, givenId);
        assertEquals(givenId, cat.getId());
    }

    @Test
    void testAnimalInheritance() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Cat cat = new Cat("", givenBirthDate, givenId);
        assertTrue(cat instanceof Animal);
    }

    @Test
    void testMammalInheritance() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Cat cat = new Cat("", givenBirthDate, givenId);
        assertTrue(cat instanceof Mammal);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)

        // When (a cat is constructed)

        // When (we retrieve data from the cat)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        assertEquals(givenName, retrievedName);
        assertEquals(givenBirthDate, retrievedBirthDate);
        assertEquals(givenId, retrievedId);
    }

}
