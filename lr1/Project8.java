import java.util.Scanner;

public class Project8 {public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    System.out.println("Число 1: ");
           int age = in.nextInt();
           System.out.println("Число 2: ");
           int age1 = in.nextInt();

              if (age>0&&age1>0){
                  int sum=age1+age;
                 System.out.println(sum);
               }else {System.out.println("не могу посчитать");
              }





          }
}
