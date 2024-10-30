package exchangeRate;

public class exchangeRateApplication {

    public static void main(String[] args) {
        CurrencyConvertor currencyConvertor = new CurrencyConvertor();
        User user = new User();
        Currency sourceCurrency = user.chooseSourceCurrency();
        Currency targetCurrency = user.chooseTargetCurrency();
        double sourceQuantity = user.enterQuantity();
        double targetQuantity = currencyConvertor.exchangeCurrency(sourceCurrency, targetCurrency, sourceQuantity);
        System.out.println(sourceQuantity + " " + sourceCurrency.getTitle() +
                " = " + targetQuantity + " " + targetCurrency.getTitle());
    }
}
