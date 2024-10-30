package PasswordGenerator;

public interface CharacterGenerator {
    public int generateSpecial();

    public int generateDigit();

    public int generateLowerCase();

    public int generateUpperCase();

    public int generateRandom();
}
