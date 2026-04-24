class PrivateClinicFactory implements MedicalServiceFactory {
    @Override
    public LaboratoryService createLaboratoryService() {
        return new PrivateLabAPI();
    }

    @Override
    public BillingService createBillingService() {
        return new PrivatePaymentGateway();
    }

    @Override
    public NotificationService createNotificationService() {
        return new WhatsAppNotification();
    }
}