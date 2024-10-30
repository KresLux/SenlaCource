package Gallows;

import java.util.HashSet;
import java.util.Set;

public class LetterStorage {

    private static final int LETTER_START_POS = 1040;
    private static final int LETTER_END_POS = 1071;
    private static final int LETTER = 1025;

    public static final int USED_LETTER_ERROR = -1;
    public static final int UNKNOWN_LETTER_ERROR = -2;

    private static final Set<Integer> usedLetters = new HashSet<>();

    public int findLetter(char letter) {
        if ((LETTER_START_POS <= letter && letter <= LETTER_END_POS) || letter == LETTER) {
            int usedLettersCount = usedLetters.size();
            usedLetters.add((int) letter);

            if (usedLettersCount == usedLetters.size()) {
                return USED_LETTER_ERROR;
            } else {
                return 0;
            }
        } else {
            return UNKNOWN_LETTER_ERROR;
        }
    }
}
