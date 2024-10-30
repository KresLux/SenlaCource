package Gallows;

public class Game {
    public void start() {
        Player player = new Player(7);
        HiddenWord hiddenWord = generateHiddenWord();
        System.out.println("Ваше слово загадано");
        System.out.println(hiddenWord.getEncryptedWord());
        while (player.getLives() != 0 && hiddenWord.getHiddenLettersCount() != 0) {
            char letter = player.enterLetter();
            boolean isGuessedLetter = hiddenWord.tryOpenLetter(letter);
            if (!isGuessedLetter) {
                int lives = player.getLives() - 1;
                player.setLives(lives);
                System.out.println(hiddenWord.getEncryptedWord());
                System.out.println("У вас осталось " + player.getLives() + " жизней");
            } else {
                System.out.println(hiddenWord.getEncryptedWord());
            }
        }
        if (player.getLives() == 0) {
            System.out.println("Вы проиграли");
            System.out.println("Было загадано слово: " + hiddenWord.getOpenWord());
        } else {
            System.out.println("Поздравляю, вы выиграли!");
        }
    }

    private HiddenWord generateHiddenWord() {
        String word = new WordsStorage().getRandomWord();
        int wordLength = word.length();
        String encryptedWord = "_".repeat(wordLength);
        return new HiddenWord(word, encryptedWord, wordLength);
    }
}
