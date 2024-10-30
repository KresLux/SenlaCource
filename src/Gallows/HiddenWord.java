package Gallows;

public class HiddenWord {
    private String openWord;
    private String encryptedWord;
    private int hiddenLettersCount;


    HiddenWord(String openWord, String encryptedWord, int hiddenLettersCount) {
        this.openWord = openWord;
        this.encryptedWord = encryptedWord;
        this.hiddenLettersCount = hiddenLettersCount;
    }

    public String getOpenWord() {
        return openWord;
    }

    public void setOpenWord(String openWord) {
        this.openWord = openWord;
    }

    public String getEncryptedWord() {
        return encryptedWord;
    }

    public void setEncryptedWord(String encryptedWord) {
        this.encryptedWord = encryptedWord;
    }

    public int getHiddenLettersCount() {
        return hiddenLettersCount;
    }

    public void setHiddenLettersCount(int hiddenLettersCount) {
        this.hiddenLettersCount = hiddenLettersCount;
    }

    public boolean tryOpenLetter(char letter) {
        StringBuilder builder = new StringBuilder(encryptedWord);
        int openLettersCount = 0;
        for (int i = 0; i < openWord.length(); i++) {
            if (openWord.charAt(i) == letter) {
                builder.setCharAt(i, letter);
                encryptedWord = builder.toString();
                openLettersCount++;
            }
        }
        if (openLettersCount == 0) {
            return false;
        } else {
            hiddenLettersCount = hiddenLettersCount - openLettersCount;
            return true;
        }
    }
}

