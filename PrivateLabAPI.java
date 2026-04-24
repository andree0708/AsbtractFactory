class PrivateLabAPI implements LaboratoryService {
    private final String apiEndpoint = "https://api.private-lab.com/orders";

    @Override
    public void processLabTest(String patientName) {
        String orderId = "PRIV-LAB-" + Math.abs(patientName.hashCode());
        System.out.println("[PrivateLabAPI] POST " + apiEndpoint);
        System.out.println("[PrivateLabAPI] Creando orden " + orderId + " para el paciente: " + patientName);
    }
}