class WhatsAppNotification implements NotificationService {
    private final String businessNumber = "+57 300 000 0000";

    @Override
    public void sendNotification(String patientName) {
        System.out.println("[WhatsApp] Cuenta empresarial: " + businessNumber);
        System.out.println("[WhatsApp] Enviando mensaje de confirmación de cita a: " + patientName);
    }
}