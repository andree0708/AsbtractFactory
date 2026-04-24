class PrivatePaymentGateway implements BillingService {
    private static final double BASE_FEE = 50.0;
    private static final double TAX_PERCENT = 16.0;

    @Override
    public void generateBill(String patientName) {
        double tax = BASE_FEE * (TAX_PERCENT / 100.0);
        double total = BASE_FEE + tax;
        System.out.println("[Pago privado] Generando cargo para: " + patientName);
        System.out.println("[Pago privado] Subtotal: $" + BASE_FEE + "  IVA(" + TAX_PERCENT + "%): $" + tax + "  Total: $" + total);
    }
}