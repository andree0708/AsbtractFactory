class PublicLabSystem implements LaboratoryService {
    private final String systemName = "PublicLabSystem";
    private final String labLocation = "Laboratorio central de salud pública";

    @Override
    public void processLabTest(String patientName) {
        String orderId = "PUB-LAB-" + Math.abs(patientName.hashCode());
        System.out.println("[" + systemName + "] Registrando orden " + orderId
                + " en " + labLocation + " para el paciente: " + patientName);
    }
}