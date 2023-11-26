import java.util.Scanner;

public class Project1 {
    public static void main(String[] args)
    {System.out.println("Project 1 Sam");
        Scanner in = new Scanner(System.in);
        System.out.println("Last name: ");
        String Last = in.nextLine();

        Scanner in1 = new Scanner(System.in);
        System.out.println("Ferst name: ");
        String Ferst = in1.nextLine();

        Scanner in2 = new Scanner(System.in);
        System.out.println("Otcestvo name: ");
        String Otcestvo = in2.nextLine();


        System.out.println("Hello ");  System.out.println("Last: " + Last); System.out.println("Ferst: " + Ferst); System.out.println("Otcestvo: " + Otcestvo);
        in.close();
    }
}
