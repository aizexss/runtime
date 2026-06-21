package five_all_tasks.task4;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                // TODO создать платежи с различным типами налогообложения
                new Bill(50_000, new IncomeTaxType(), taxService),
                new Bill(100_000, new VATaxType(), taxService),
                new Bill(150_000, new ProgressiveTaxType(), taxService)
        };

        for (int i = 0; i < payments.length; i++) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
