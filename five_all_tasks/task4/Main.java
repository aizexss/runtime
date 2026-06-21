package five_all_tasks.task4;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                // TODO создать платежи с различным типами налогообложения
                new Bill(BigDecimal.valueOf(50_000), new IncomeTaxType(), taxService),
                new Bill(BigDecimal.valueOf(100_000), new VATaxType(), taxService),
                new Bill(BigDecimal.valueOf(150_000), new ProgressiveTaxType(), taxService)
        };

        for (int i = 0; i < payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
