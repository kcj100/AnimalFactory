package rocks.zipcodewilmington;

import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    void createDogTest() {
        Date date = new Date(2000, 2, 1);
        Dog dog1 = AnimalFactory.createDog("joe", date);
        assertEquals("joe", dog1.getName());
        assertEquals(date, dog1.getBirthDate());
    }

    @Test
    void createCatTest() {
        Date date = new Date(2000, 2, 1);
        Cat cat1 = AnimalFactory.createCat("joe", date);
        assertEquals("joe", cat1.getName());
        assertEquals(date, cat1.getBirthDate());
    }
}
