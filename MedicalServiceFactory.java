interface MedicalServiceFactory {
    LaboratoryService createLaboratoryService();
    BillingService createBillingService();
    NotificationService createNotificationService();
}