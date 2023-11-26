import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Project3 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("day ");
        String date = scanner.next();
        System.out.println("month ");
        String date2 = scanner.next();
        System.out.println("year ");
        String date3 = scanner.next();

        System.out.println("set date "+date+"."+date2+"."+date3);

    }

}
