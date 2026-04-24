public class Main {
    public static void main(String[] args) {
        String clinicType = "PUBLIC";

        MedicalServiceFactory factory;
        String clinicDescription;

        if ("PUBLIC".equalsIgnoreCase(clinicType)) {
            factory = new PublicClinicFactory();
            clinicDescription = "Clínica pública";
            System.out.println("=== Clínica pública seleccionada ===");
        } else if ("PRIVATE".equalsIgnoreCase(clinicType)) {
            factory = new PrivateClinicFactory();
            clinicDescription = "Clínica privada";
            System.out.println("=== Clínica privada seleccionada ===");
        } else {
            System.out.println("Tipo de clínica no válido. Use \"PUBLIC\" o \"PRIVATE\".");
            return;
        }

        AppointmentService appointmentService = new AppointmentService(factory, clinicDescription);
        appointmentService.scheduleAppointment("Paciente Demo");
    }
}