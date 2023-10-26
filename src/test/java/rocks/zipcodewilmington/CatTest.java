package rocks.zipcodewilmington;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

        cat = new Cat(givenName, givenBirthDate, givenId);
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
