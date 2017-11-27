package xnopre;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {

    @Test
    public void should_calculate_price_taxe_free() {
        // Préparation
        PriceCalculator priceCalculator = new PriceCalculator();

        // Test
        String totalPrice = priceCalculator.calculatePrice(3, 1.21, 0);

        // Vérifications
        assertEquals("3.63 €", totalPrice);
    }

    @Test
    public void should_calculate_price_with_taxe() {
        // Préparation
        PriceCalculator priceCalculator = new PriceCalculator();

        // Test
        String totalPrice = priceCalculator.calculatePrice(3, 1.21, 5);

        // Vérifications
        assertEquals("3.81 €", totalPrice);
    }

    @Test
    public void should_calculate_price_with_taxe_20() {
        // Préparation
        PriceCalculator priceCalculator = new PriceCalculator();

        // Test
        String totalPrice = priceCalculator.calculatePrice(3, 1.21, 20);

        // Vérifications
        assertEquals("4.36 €", totalPrice);
    }
}
