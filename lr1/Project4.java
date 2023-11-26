import java.util.Scanner;

public class Project4 {

    public static void main(String[] var0) {
        System.out.println("Project 4");

        Scanner in = new Scanner(System.in);
        System.out.println("В ведите название месяца по Русски: " );
        String Last = in.nextLine();

        String Anvar1="31";
        String Fevral1="28";
        String Mart1="31";
        String Aprel1="30";
        String Mai1="31";
        String Iyn1="30";
        String Iyl1="31";
        String Avgust1="31";
        String Sentabr1="30";
        String Oktabr1="31";
        String Noabr1="30";
        String Dekabr1="31";

        String Anvar="Январь";
        String Fevral="Февраль";
        String Mart="Март";
        String Aprel="Апрель";
        String Mai="Май";
        String Iyn="Июнь";
        String Iyl="Июль";
        String Avgust="Август";
        String Sentabr="Сентябрь";
        String Oktabr="Октябрь";
        String Noabr="Ноябрь";
        String Dekabr="Декабрь";


        if (Last.equals(Anvar))
        {
            System.out.println("В "+Anvar+", "+Anvar1+" день");
        }
        else if (Last.equals(Fevral))
        {
            System.out.println("В "+Fevral+", "+Fevral1+" день");
        }
        else if (Last.equals(Mart))
        {
            System.out.println("В "+Mart+", "+Mart1+" день");

        }
        else if (Last.equals(Aprel))
        {
            System.out.println("В "+Aprel+", "+Aprel1+" день");
        }
        else if (Last.equals(Mai))
        {
            System.out.println("В "+Mai+", "+Mai1+" день");

        }
        else if (Last.equals(Iyn))
        {
            System.out.println("В "+Iyn+", "+Iyn1+" день");
        }
        else if (Last.equals(Iyl))
        {
            System.out.println("В "+Iyl+", "+Iyl1+" день");
        }
        else if (Last.equals(Avgust))
        {
            System.out.println("В "+Avgust+", "+Avgust1+" день");
        }
        else if (Last.equals(Sentabr))
        {
            System.out.println("В "+Sentabr+", "+Sentabr1+" день");
        }
        else if (Last.equals(Oktabr))
        {
            System.out.println("В "+Oktabr+", "+Oktabr1+" день");
        }
        else if (Last.equals(Noabr))
        {
            System.out.println("В "+Noabr+", "+Noabr1+" день");
        }
        else if (Last.equals(Dekabr))
        {

            System.out.println("В "+Dekabr+", "+Dekabr1+" день");
        }

    }
}
