package five_all_tasks.task4;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    private static final BigDecimal THRESHOLD = BigDecimal.valueOf(100_000);
    private static final BigDecimal LOW_RATE = new BigDecimal("0.10");
    private static final BigDecimal HIGH_RATE = new BigDecimal("0.15");

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        BigDecimal rate = amount.compareTo(THRESHOLD) > 0
                ? HIGH_RATE
                : LOW_RATE;

        return amount.multiply(rate);
    }
}