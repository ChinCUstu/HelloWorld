import java.util.Scanner;

public class Exercise_ControlFLow {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

//          HAVE THE MOST SPECIFIC CONDITIONS AT THE TOP AND THE GENERIC CONDITIONS AT THE BOTTOM
        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else if (number % 5 == 0)
            System.out.println("FizzBuzz");
        else
            System.out.println(number);

    }
}
