import java.util.Scanner;

public class Project9 {public static void main(String[] args) {
    int constanta = 1;

    Scanner in = new Scanner(System.in);
    System.out.println("Число 1: ");
    int age = in.nextInt();
    int datedefolt=1;

    System.out.println( age+datedefolt + "на единицу больше");
    System.out.println( age-datedefolt + " на единицу меньше");
    System.out.println( age + " число ввиденое");
    System.out.println( age-datedefolt*2 +2*age-datedefolt*age+datedefolt+ age+datedefolt*2 + " сумма квадратов");
}
}
