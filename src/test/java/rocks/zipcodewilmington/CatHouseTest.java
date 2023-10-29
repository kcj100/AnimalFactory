package rocks.zipcodewilmington;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @AfterEach
    void tearDown() {
        CatHouse.clear();
    }

    @Test
    void addTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Cat cat = new Cat("", givenBirthDate, givenId);
        CatHouse.add(cat);
        assertEquals(cat, CatHouse.getCatById(givenId));
    }

    @Test
    void removeTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Cat cat = new Cat("", givenBirthDate, givenId);
        CatHouse.add(cat);
        assertEquals(1, CatHouse.getNumberOfCats());
        CatHouse.remove(cat);
        assertEquals(0, CatHouse.getNumberOfCats());
    }

    @Test
    void getCatByIdTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Cat cat = new Cat("", givenBirthDate, givenId);
        CatHouse.add(cat);
        assertEquals(cat, CatHouse.getCatById(givenId));
    }

    @Test
    void getNumberOfCatsTest() {
        String givenName = "Zula";
        Date givenBirthDate = new Date(2000,2,23);
        Integer givenId = 0;
        Cat cat = new Cat("", givenBirthDate, givenId);
        CatHouse.add(cat);
        assertEquals(1, CatHouse.getNumberOfCats());
        CatHouse.remove(cat);
        assertEquals(0, CatHouse.getNumberOfCats());
    }
}
