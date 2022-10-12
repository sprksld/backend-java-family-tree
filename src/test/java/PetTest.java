import org.junit.Test;

import static org.junit.Assert.assertEquals;

class PetTest {
    @Test
    public void shouldHaveName() {
        // arrange
        Pet dog = new Pet( "Pluto", 92, "Sint-Hubertus");


        // act

        String result = dog.getName();

        // assert

        assertEquals( "Pluto", result );
    }

}
