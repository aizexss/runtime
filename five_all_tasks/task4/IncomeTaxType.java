package five_all_tasks.task4;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.multiply(new BigDecimal("0.13"));
    }
}
