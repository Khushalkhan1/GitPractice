import java.util.Scanner;

public class Help {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("how may i help you");
        String help = scan.nextLine();
        System.out.println("how old are you");
        int age = scan.nextInt();
        System.out.println("what type of license do you want");
        char type = scan.next().charAt(0);
        System.out.println("congratulation");


        }
    }

