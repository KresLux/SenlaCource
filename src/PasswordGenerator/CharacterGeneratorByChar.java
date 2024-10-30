package PasswordGenerator;

public class CharacterGeneratorByChar implements CharacterGenerator {
    private static final int DIGIT_START_POS = 48;
    private static final int DIGIT_END_POS = 57;

    private static final int LOWER_CASE_START_POS = 97;
    private static final int LOWER_CASE_END_POS = 122;

    private static final int UPPER_CASE_START_POS = 65;
    private static final int UPPER_CASE_END_POS = 90;

    private static final int SPECIAL_GROUP_COUNT = 4;

    private static final int SPECIAL_START_POS1 = 33;
    private static final int SPECIAL_END_POS1 = 47;
    private static final int SPECIAL_START_POS2 = 58;
    private static final int SPECIAL_END_POS2 = 64;
    private static final int SPECIAL_START_POS3 = 91;
    private static final int SPECIAL_END_POS3 = 96;
    private static final int SPECIAL_START_POS4 = 123;
    private static final int SPECIAL_END_POS4 = 126;

    private static final int RANDOM_START_POS = 33;
    private static final int RANDOM_END_POS = 126;


    @Override
    public int generateSpecial() {
        int specialGroupNumber = (int) (Math.random() * SPECIAL_GROUP_COUNT + 1);
        int specialCharacterNumber = 0;
        switch (specialGroupNumber) {
            case 1 -> {
                int specialCount1 = SPECIAL_END_POS1 - SPECIAL_START_POS1 + 1;
                specialCharacterNumber = (int) (Math.random() * specialCount1 + SPECIAL_START_POS1);
            }
            case 2 -> {
                int specialCount2 = SPECIAL_END_POS2 - SPECIAL_START_POS2 + 1;
                specialCharacterNumber = (int) (Math.random() * specialCount2 + SPECIAL_START_POS2);
            }
            case 3 -> {
                int specialCount3 = SPECIAL_END_POS3 - SPECIAL_START_POS3 + 1;
                specialCharacterNumber = (int) (Math.random() * specialCount3 + SPECIAL_START_POS3);
            }
            case 4 -> {
                int specialCount4 = SPECIAL_END_POS4 - SPECIAL_START_POS4 + 1;
                specialCharacterNumber = (int) (Math.random() * specialCount4 + SPECIAL_START_POS4);
            }
        }
        return specialCharacterNumber;
    }

    @Override
    public int generateDigit() {
        int digitCount = DIGIT_END_POS - DIGIT_START_POS + 1;
        return (int) (Math.random() * digitCount + DIGIT_START_POS);
    }

    @Override
    public int generateLowerCase() {
        int lowerCaseCount = LOWER_CASE_END_POS - LOWER_CASE_START_POS + 1;
        return (int) (Math.random() * lowerCaseCount + LOWER_CASE_START_POS);
    }

    @Override
    public int generateUpperCase() {
        int lowerCaseCount = UPPER_CASE_END_POS - UPPER_CASE_START_POS + 1;
        return (int) (Math.random() * lowerCaseCount + UPPER_CASE_START_POS);
    }

    @Override
    public int generateRandom() {
        int randomCount = RANDOM_END_POS - RANDOM_START_POS + 1;
        return (int) (Math.random() * randomCount + RANDOM_START_POS);
    }
}
