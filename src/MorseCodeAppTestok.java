import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeAppTestok {

    @Test
    void main() {
        assertEquals(".-", MorseCodeConverter.toMorse("A"));
    }
}