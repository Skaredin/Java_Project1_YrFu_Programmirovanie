import java.util.Scanner;

public class Project5 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите сколько вам лет ");
        int date3 = Integer.parseInt(scanner.next());
        int datedefolt=2023;

        if (datedefolt >= date3) {
            System.out.println("Родились");
            System.out.println( datedefolt-date3 + " года");
        }
        else{ System.out.println("Ещё не родился");}



    }
}
