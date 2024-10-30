package PasswordGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasswordGeneratorImpl implements PasswordGenerator {
    @Override
    public String generatePassword(int length) {
        CharacterGenerator characterGenerator = new CharacterGeneratorByChar();
        List<Integer> characters = new ArrayList<>();
        characters.add(characterGenerator.generateDigit());
        characters.add(characterGenerator.generateLowerCase());
        characters.add(characterGenerator.generateUpperCase());
        characters.add(characterGenerator.generateSpecial());
        for (int i = 4; i < length; i++) {
            characters.add(characterGenerator.generateRandom());
        }
        Collections.shuffle(characters);
        StringBuilder password = new StringBuilder();
        for (int characterNumber : characters) {
            password.append((char) characterNumber);
        }
        return password.toString();
    }
}
