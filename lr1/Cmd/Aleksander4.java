package Cmd;

import java.util.Scanner; public class Aleksander4
{ public static void main(String[] args)
{System.out.println("Project 4");
 Scanner in = new Scanner(System.in); System.out.println("Input name: ");
 String name = in.nextLine();
 System.out.println("Input age: ");
 int age = in.nextInt(); 
 System.out.println("Input height: ");
 float height = in.nextFloat();


 System.out.println("Name: " + name);
 System.out.println("Age: " + age);
 System.out.println("Height: " + height);
 in.close();
}
}