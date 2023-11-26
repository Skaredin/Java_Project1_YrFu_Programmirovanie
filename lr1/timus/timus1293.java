package timus;
import java.util.Scanner;
public class timus1293 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Компонент А: ");
        int A = in.nextInt();
        System.out.println("Компонент B: ");
        int B = in.nextInt();
        System.out.println("Компонент N: ");
        int N = in.nextInt();
        int con = 1;
        int maxcon = 100;

        if(con<=A & maxcon>=A)
        {
            if(con<=B & maxcon>=B)
            {

                if(con<=N & maxcon>=N)
                {

                    int P= (A*B)*2;
                    int Try = P*N;
                    System.out.println("сульфида тория: "+ Try +" нанограмм");
                } else {System.out.println("Привышает норму (con<=N & maxcon>=N): ");}
            }  else {System.out.println("Привышает норму (con<=B & maxcon>=B): ");}
        }else {System.out.println("Привышает норму (con<=A & maxcon>=A): ");}

    }
}