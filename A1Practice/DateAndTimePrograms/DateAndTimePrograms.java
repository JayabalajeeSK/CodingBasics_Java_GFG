package DateAndTimePrograms;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimePrograms 
{
        // 1. Format time in AM-PM format
    public static void formatTimeInAMPM() 
    {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("Time in AM/PM format: " + time.format(formatter));
    }
// 1. Format time in AM-PM format:
// Time in AM/PM format: 08:06:42 pm

    // 2. Display current date and time
    public static void displayCurrentDateTime() 
    {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);
    }
// 2. Display current date and time:
// Current date and time: 2025-07-02T20:06:42.842271100

    // 3. Display date in various formats
    public static void displayDatesInFormats() 
    {
        LocalDate date = LocalDate.now();
        System.out.println("Default: " + date);
        System.out.println("dd/MM/yyyy: " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("MM-dd-yyyy: " + date.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
        System.out.println("yyyy.MM.dd: " + date.format(DateTimeFormatter.ofPattern("yyyy.MM.dd")));
        System.out.println("Full Format: " + date.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy")));
    }
// 3. Display Dates of Calendar Year in Different Format:
// Default: 2025-07-02
// dd/MM/yyyy: 02/07/2025
// MM-dd-yyyy: 07-02-2025
// yyyy.MM.dd: 2025.07.02
// Full Format: Wednesday, July 02, 2025

    // 4. Display time in different country format (ZoneId)
    public static void displayTimeInDifferentCountry(String country, String zoneId) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of(zoneId));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy hh:mm:ss a z");
        System.out.println("Time in " + country + ": " + zonedDateTime.format(formatter));
    }
// 4. Display time in different country's format:
// Time in India: 02 Jul 2025 08:06:42 pm IST
// Time in USA: 02 Jul 2025 10:36:42 am GMT-04:00
// Time in Japan: 02 Jul 2025 11:36:42 pm JST

    // 5. Convert local time to GMT
    public static void convertLocalToGMT() 
    {
        ZonedDateTime localTime = ZonedDateTime.now();
        ZonedDateTime gmtTime = localTime.withZoneSameInstant(ZoneId.of("GMT"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("Local Time: " + localTime.format(formatter));
        System.out.println("GMT Time:   " + gmtTime.format(formatter));
    } 
// 5. Convert the local Time to GMT:
// Local Time: 2025-07-02 20:06:42 IST
// GMT Time:   2025-07-02 14:36:42 GMT   
}
