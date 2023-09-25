import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times Java");

        }

        System.out.println("Python");

        System.out.println("--------------------------");

        Scanner scan = new Scanner(System.in);
        // We need just one Scanner object, so we created the Scanner object outside the loop body

        int num =0;

        while (true){
            System.out.println("Enter a number");
            num = scan.nextInt();

            if (num < 0){
                System.out.println("Enter a positive number");
                break; // exists the loop
            }

            System.out.println("You have entered " + num);


        }
        System.out.println("-------------------------------------------------");

        for (char i = 'A'; i <= 'K'; i++) {
            if (i == 'D' || i =='H' || i =='J'){
                // return; //exits the method
                   continue; // skips
            }

            System.out.println(i);
        }

        System.out.println("Hello");

    }

}
