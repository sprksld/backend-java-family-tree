import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void shouldHaveDog() {
        // arrange
        Person p = new Person( "John", "Doe", 41, "M");
        Pet d = new Pet("Scooby", 17, "Big Dog");

        // act

        String result = p.getName();

        // assert

        assertEquals( "John", result );
        assertEquals( "Pete", result ); // should fail

    }



}
