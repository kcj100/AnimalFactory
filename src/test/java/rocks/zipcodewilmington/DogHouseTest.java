package rocks.zipcodewilmington;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @AfterEach
    void tearDown() {
        DogHouse.clear();
    }

    @Test
    void addTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Dog dog = new Dog("", givenBirthDate, givenId);
        DogHouse.add(dog);
        assertEquals(dog, DogHouse.getDogById(givenId));
    }

    @Test
    void removeTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Dog dog = new Dog("", givenBirthDate, givenId);
        DogHouse.add(dog);
        assertEquals(1, DogHouse.getNumberOfDogs());
        DogHouse.remove(dog);
        assertEquals(0, DogHouse.getNumberOfDogs());
    }

    @Test
    void getDogByIdTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Dog dog = new Dog("", givenBirthDate, givenId);
        DogHouse.add(dog);
        assertEquals(dog, DogHouse.getDogById(givenId));
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
