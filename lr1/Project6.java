import java.util.Scanner;

public class Project6 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        System.out.println("Ведите имя: ");
        String Last = in.nextLine();

        System.out.println("Ведите дату рождения ");
        int date3 = Integer.parseInt(scanner.next());
        int datedefolt=2023;

        if (datedefolt >= date3) {
            System.out.println("Меня зовут "+Last+",и мой возраст");
            System.out.println( datedefolt-date3 + " года");
        }
        else{ System.out.println("Ещё не родился");}



    }
}
