import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void shouldHaveDog() {
        // arrange
        Person p = new Person( "John", "Doe", 41, "M");
        Pet d = new Pet("Scooby", 17, "Big Dog");

        // act && assert

        assertEquals( "John", p.getName() );
        assertEquals( "Doe", p.getLastName() );

    }



}
