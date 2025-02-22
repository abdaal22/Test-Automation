import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeConverterTest {

    @Test
    void toMorse_singleLetter() {
        assertEquals(".-", MorseCodeConverter.toMorse("B"));
    }

    @Test
    void toMorse_multipleLetters() {
        assertEquals(".... . .-.. .-.. ---", MorseCodeConverter.toMorse("BYE"));
    }

    @Test
    void toEnglish_singleMorseCharacter() {
        assertEquals("E", MorseCodeConverter.toEnglish("."));
    }

    @Test
    void toEnglish_multipleMorseCharacters() {
        assertEquals("HELLO", MorseCodeConverter.toEnglish(".... . .-.. .-.. ---"));
    }
    @Test
    void testToMorse_EmptyString() { assertEquals("", MorseCodeConverter.toMorse(""));
    }

}