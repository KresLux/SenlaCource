package exchangeRate;
import java.util.Scanner;

public class User {

    private static final Currency USD = new Currency("USD", 1.0);
    private static final Currency BYN = new Currency("BYN", 0.303085);
    private static final Currency RUB = new Currency("RUB", 0.010345);
    private static final Currency EUR = new Currency("EUR", 1.08);
    private static final Currency CNY = new Currency("CNY", 0.140461);
    private static final Currency CAD = new Currency("CAD", 0.719839);
    private static final Currency AED = new Currency("AED", 0.272257);

    private static final int CURRENCY_VALUABLE = 7;

    public Currency chooseSourceCurrency() {
        System.out.println(("""
                Выберите вашу валюту(введите её номер)
                1) USD
                2) BYN
                3) RUB
                4) EUR
                5) CNY
                6) CAD
                7) AED"""));
        return chooseCurrency();
    }

    public Currency chooseTargetCurrency() {
        System.out.println("""
                Выберите валюту в которую вы хотите перевести ваши деньги (введите её номер)
                1) USD
                2) BYN
                3) RUB
                4) EUR
                5) CNY
                6) CAD
                7) AED""");
        return chooseCurrency();
    }

    public double enterQuantity(){
        System.out.println("Выберите какую сумму вы хотите перевести" +
                "(Введите целое число или десятичную дробь, используя точку вместо запятой)");
        double Quantity = -1;
        String ValuableString;
        Scanner scanner = new Scanner(System.in);
        while (Quantity < 0) {
            ValuableString = scanner.next();
            try {
                Quantity = Double.parseDouble(ValuableString);
            } catch (NumberFormatException e){
                System.out.println("Вы должны ввести целое число или десятичную дробь, используя точку вместо запятой!");
                continue;
            }
            if(Quantity < 0){
                System.out.println("Количество вашей валюты не может быть отрицательным!");
            }
        }
        return Quantity;
    }

    private Currency chooseCurrency() {
        int number = 0;
        String numberString;
        Scanner scanner = new Scanner(System.in);
        while (!(1 <= number && number <= CURRENCY_VALUABLE)) {
            numberString = scanner.next();
            try {
                number = Integer.parseInt(numberString);
            } catch (NumberFormatException e) {
                System.out.println("Введите цифру (номер валюты)!");
                continue;
            }
            if (!(1 <= number && number <= CURRENCY_VALUABLE)) {
                System.out.println("Валюты под таким номером не существует");
            }
        }

        Currency sourceCurrency;
        switch (number) {
            case 1 -> sourceCurrency = USD;
            case 2 -> sourceCurrency = BYN;
            case 3 -> sourceCurrency = RUB;
            case 4 -> sourceCurrency = EUR;
            case 5 -> sourceCurrency = CNY;
            case 6 -> sourceCurrency = CAD;
            case 7 -> sourceCurrency = AED;
            default -> {
                return null;
            }
        }
        return sourceCurrency;
    }
}
