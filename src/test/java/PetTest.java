import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {
    @Test
    void shouldHaveName() {
        // arrange
        Pet dog = new Pet( "Pluto", 92, "Sint-Hubertus");

        // act
        String result = dog.getName();

        // assert
        assertEquals( "Pluto", result );
    }

}
