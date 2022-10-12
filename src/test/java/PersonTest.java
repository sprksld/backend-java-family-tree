import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
    }



}
