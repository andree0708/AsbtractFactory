import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentService {
    private static int sequence = 0;

    private final LaboratoryService laboratoryService;
    private final BillingService billingService;
    private final NotificationService notificationService;
    private final String clinicDescription;

    public AppointmentService(MedicalServiceFactory factory, String clinicDescription) {
        this.laboratoryService = factory.createLaboratoryService();
        this.billingService = factory.createBillingService();
        this.notificationService = factory.createNotificationService();
        this.clinicDescription = clinicDescription;
    }

    public void scheduleAppointment(String patientName) {
        int appointmentId = ++sequence;
        LocalDateTime now = LocalDateTime.now();
        String formattedDate = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        System.out.println("===== Cita #" + appointmentId + " | " + clinicDescription + " | " + formattedDate + " =====");

        laboratoryService.processLabTest(patientName);
        billingService.generateBill(patientName);
        notificationService.sendNotification(patientName);

        System.out.println("===== Fin del flujo de cita para: " + patientName + " =====");
        System.out.println();
    }
}