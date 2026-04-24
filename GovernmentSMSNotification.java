class GovernmentSMSNotification implements NotificationService {
    private final String senderId = "SALUD-GOB";

    @Override
    public void sendNotification(String patientName) {
        System.out.println("[SMS Gobierno] Remitente: " + senderId);
        System.out.println("[SMS Gobierno] Enviando SMS de confirmación de cita al paciente: " + patientName);
    }
}