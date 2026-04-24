class GovernmentBillingSystem implements BillingService {
    private static final double BASE_FEE = 0.0;
    private static final double SUBSIDY_PERCENT = 100.0;

    @Override
    public void generateBill(String patientName) {
        System.out.println("[Gobierno] Calculando copago para: " + patientName);
        System.out.println("[Gobierno] Monto base: " + BASE_FEE + " (subsidio " + SUBSIDY_PERCENT + "%, paciente no paga).");
    }
}