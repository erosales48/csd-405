package Examples;

import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DayOfWeekExample {
    public static void main(String[] args) {

        String[] months = new DateFormatSymbols().getMonths();

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

            int year = date.getYear();
            int month = date.getMonthValue() - 1;
            int day = date.getDayOfMonth();

            // Get the full name of the day of the week in the default locale
            String dayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault());

            // Print the day of the week
            System.out.println("\nThe day of the week for " + day + " " +
                                months[month] + " " + year + " is: " + dayName);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in the format dd-MM-yyyy.");
        }

        // Close the scanner
        scanner.close();
    }
}
