import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//bugs introduced by DD
public class datetime_convert {
    public static void main(String[] args) {
        
        // String that contains the date and time
        String dateStr = "2022-03-17 10:45:30";
        
        // Creates a formatter that will be used later
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        // Setting the dateObj object to the datetime using the formatter
        LocalDateTime dateObj = LocalDateTime.parse(dateStr, formatter);
        
        // Formatting the date and setting a varialbe equal to the result of the formatting
        String formattedDate = dateObj.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));

        System.out.println(fomattedDate);
    }
}
