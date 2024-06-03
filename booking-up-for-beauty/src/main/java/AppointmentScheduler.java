import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {

    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, DateTimeFormatter.ofPattern("M'/'d'/'u' 'k':'m':'s"));
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return LocalDateTime.now().isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" eeee', 'LLLL d', 'u', at 'h':'mm a'.'");
        return "You have an appointment on" + appointmentDate.format(formatter);
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.now().withDayOfMonth(15).withMonth(9);
    }
}
