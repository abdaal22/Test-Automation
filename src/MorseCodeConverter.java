import java.util.HashMap;
import java.util.Map;

public class MorseCodeConverter {
    private static final Map<Character, String> englishToMorse = new HashMap<>();
    private static final Map<String, Character> morseToEnglish = new HashMap<>();

    static {
        String[][] morseArray = {
                {"A", ".-"}, {"B", "-..."}, {"C", "-.-."}, {"D", "-.."}, {"E", "."},
                {"F", "..-."}, {"G", "--."}, {"H", "...."}, {"I", ".."}, {"J", ".---"},
                {"K", "-.-"}, {"L", ".-.."}, {"M", "--"}, {"N", "-."}, {"O", "---"},
                {"P", ".--."}, {"Q", "--.-"}, {"R", ".-."}, {"S", "..."}, {"T", "-"},
                {"U", "..-"}, {"V", "...-"}, {"W", ".--"}, {"X", "-..-"}, {"Y", "-.--"}, {"Z", "--.."}
        };
        for (String[] entry : morseArray) {
            englishToMorse.put(entry[0].charAt(0), entry[1]);
            morseToEnglish.put(entry[1], entry[0].charAt(0));
        }
    }

    public static String toMorse(String text) {
        StringBuilder morseCode = new StringBuilder();
        for (char c : text.toUpperCase().toCharArray()) {
            String morse = englishToMorse.get(c);
            if (morse != null) morseCode.append(morse).append(" ");
        }
        return morseCode.toString().trim();
    }

    public static String toEnglish(String morse) {
        StringBuilder englishText = new StringBuilder();
        for (String morseLetter : morse.split(" ")) {
            Character letter = morseToEnglish.get(morseLetter);
            if (letter != null) englishText.append(letter);
        }
        return englishText.toString();
    }
}