package Examples;

import java.text.DateFormatSymbols;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class DayOfWeekExample {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a date in the format "yyyy-MM-dd"
        System.out.print("\nEnter a date (dd-MM-yyyy): ");
        String inputDate = scanner.nextLine();

        // Define the date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            // Parse the input date string to a LocalDate object
            LocalDate date = LocalDate.parse(inputDate, formatter);

            // Get the day of the week for the given date
            DayOfWeek dayOfWeek = date.getDayOfWeek();

            GregorianCalendar gcal = new GregorianCalendar(date.getYear(), date.getMonthValue(), date.getDayOfMonth());

            int year = gcal.get(Calendar.YEAR);
            int month = (gcal.get(Calendar.MONTH) - 1);
            int day = gcal.get(Calendar.DAY_OF_MONTH);

            String[] months = new DateFormatSymbols().getMonths();

            // Get the full name of the day of the week in the default locale
            String dayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());

            // Print the day of the week
            System.out.println("\nThe day of the week for " + day + " " +months[month] + " "  + year + " is: " + dayName);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in the format dd-MM-yyyy.");
        }

        // Close the scanner
        scanner.close();
    }
}
