package xnopre;

public class PriceCalculator {
    public String calculatePrice(int quantity, double unitPrice, double taxe) {
        double totalPriceWithTaxe = quantity * unitPrice * (100 + taxe) / 100.0;
        double totalPrice = ((int) ((totalPriceWithTaxe * 100+0.5)) / 100.0);
        return totalPrice + " €";
    }
}
