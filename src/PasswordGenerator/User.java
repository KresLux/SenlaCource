package PasswordGenerator;

import java.util.Scanner;

public class User {

    public int choosePasswordLength() {
        int passwordLength = 0;
        String passwordLengthString;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число(длину пароля) от 8 до 12 сиволов");
        while (!(8 <= passwordLength && passwordLength <= 12)) {
            passwordLengthString = scanner.next();
            try {
                passwordLength = Integer.parseInt(passwordLengthString);
            } catch (NumberFormatException e) {
                System.out.println("Введённые данные должны быть целым числом от 8 до 12");
                continue;
            }
            if(!(8 <= passwordLength && passwordLength <= 12)) {
                System.out.println("Введённое число должно быть от 8 до 12");
            }
        }
        return passwordLength;
    }
}
