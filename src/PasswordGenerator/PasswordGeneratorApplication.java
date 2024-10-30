package PasswordGenerator;

public class PasswordGeneratorApplication {
    public static void main(String[] args) {
        int passwordLength = new User().choosePasswordLength();
        PasswordGenerator passwordGenerator = new PasswordGeneratorImpl();
        String password = passwordGenerator.generatePassword(passwordLength);
        System.out.println("Ваш сгенерированный пароль: " + password);
    }
}
