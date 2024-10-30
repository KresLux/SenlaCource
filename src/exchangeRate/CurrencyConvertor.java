package exchangeRate;

public class CurrencyConvertor {

    public double exchangeCurrency(Currency sourceCurrency, Currency targetCurrency, double sourceCurrencyQuantity){
        return sourceCurrency.getPrice()/targetCurrency.getPrice() * sourceCurrencyQuantity;
    }
}
