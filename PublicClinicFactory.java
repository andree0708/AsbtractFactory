class PublicClinicFactory implements MedicalServiceFactory {
    @Override
    public LaboratoryService createLaboratoryService() {
        return new PublicLabSystem();
    }

    @Override
    public BillingService createBillingService() {
        return new GovernmentBillingSystem();
    }

    @Override
    public NotificationService createNotificationService() {
        return new GovernmentSMSNotification();
    }
}