import java.util.Scanner;

public class Project2 {
    public static void main(String[] args)
    {
        System.out.println("Project 2 Sam");
        Scanner in = new Scanner(System.in);

        System.out.println("Last name: ");
        String Last = in.nextLine();

        System.out.println("Let age: ");
        int age = in.nextInt();


        System.out.println("Hello ");  System.out.println("Last: " + Last); System.out.println("Let: " + age);
        in.close();
    }
}
