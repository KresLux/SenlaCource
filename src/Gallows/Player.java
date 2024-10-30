package Gallows;

import java.util.Scanner;

public class Player {
    private int lives;

    Player(int lives) {
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public char enterLetter() {
        System.out.println("Попробуйте угадать букву");
        Scanner scanner = new Scanner(System.in);
        LetterStorage letterStorage = new LetterStorage();
        char letter;
        while (true) {
            String enteredLetter = scanner.next().toUpperCase();
            if (enteredLetter.length() > 1) {
                System.out.println("Нужно ввести 1 символ (букву русского алфавита)");
            } else {
                letter = enteredLetter.charAt(0);
                switch (letterStorage.findLetter(letter)) {
                    case (0) -> {
                        return letter;
                    }
                    case (LetterStorage.USED_LETTER_ERROR) ->
                            System.out.println("Вы уже вводили эту букву, попробуйте другую");

                    case (LetterStorage.UNKNOWN_LETTER_ERROR) ->
                            System.out.println("Введённый символ должен быть буквой русского алфавита");
                }
            }
        }
    }
}
