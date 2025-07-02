package DateAndTimePrograms;

public class DateAndTimeProgramsRunner extends DateAndTimePrograms
{
    public static void main(String[] args) 
    {

        System.out.println("\n1. Format time in AM-PM format:");
        formatTimeInAMPM();

        System.out.println("\n2. Display current date and time:");
        displayCurrentDateTime();

        System.out.println("\n3. Display Dates of Calendar Year in Different Format:");
        displayDatesInFormats();

        System.out.println("\n4. Display time in different country's format:");
        displayTimeInDifferentCountry("India", "Asia/Kolkata");
        displayTimeInDifferentCountry("USA", "America/New_York");
        displayTimeInDifferentCountry("Japan", "Asia/Tokyo");

        System.out.println("\n5. Convert the local Time to GMT:");
        convertLocalToGMT();
    }
}
// 1. Format time in AM-PM format:
// Time in AM/PM format: 08:06:42 pm

// 2. Display current date and time:
// Current date and time: 2025-07-02T20:06:42.842271100

// 3. Display Dates of Calendar Year in Different Format:
// Default: 2025-07-02
// dd/MM/yyyy: 02/07/2025
// MM-dd-yyyy: 07-02-2025
// yyyy.MM.dd: 2025.07.02
// Full Format: Wednesday, July 02, 2025

// 4. Display time in different country's format:
// Time in India: 02 Jul 2025 08:06:42 pm IST
// Time in USA: 02 Jul 2025 10:36:42 am GMT-04:00
// Time in Japan: 02 Jul 2025 11:36:42 pm JST

// 5. Convert the local Time to GMT:
// Local Time: 2025-07-02 20:06:42 IST
// GMT Time:   2025-07-02 14:36:42 GMT