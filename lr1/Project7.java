import java.util.Scanner;

public class Project7 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите дату рождения ");
        int date3 = Integer.parseInt(scanner.next());
        int datedefolt=2023;

        if (datedefolt >= date3) {
            System.out.println("Мне сейчас");
            System.out.println( datedefolt-date3 + " лет");
        }
        else{ System.out.println("Ещё не родился");}



    }
}
