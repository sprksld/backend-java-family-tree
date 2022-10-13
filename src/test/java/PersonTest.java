import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void shouldHaveDog() {
        // arrange
        Person p = new Person( "John", "Doe", 41, "M");
        Pet d1 = new Pet("Scooby", 17, "Big Dog");
        Pet d2 = new Pet("Pluto", 92, "Herder");
        p.addPet( d1 );
        p.addPet( d2 );

        // act
        List<Pet> result = p.getPets();
        int numberOfPets = result.size();

        // assert
        assertNotEquals( 0, numberOfPets );

    }

}
