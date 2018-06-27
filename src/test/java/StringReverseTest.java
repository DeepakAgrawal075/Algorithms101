import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringReverseTest {

    @Test
    void givenStringReturnReverse() {
        assertEquals("RABOOF", StringReverse.reverse("FOOBAR"));
        assertEquals("", StringReverse.reverse(""));
        assertEquals(null, StringReverse.reverse(null));
    }
}