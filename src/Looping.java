import java.util.Scanner;

public class Looping {

    public static void main(String[] args){
//        for (int i = 1; i <= 5; i++)
//            System.out.println("Hello World " + i);

//        int i = 0;
//        while(i < 5){
//            System.out.println("Hello World " + i);
//            i++;
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue; // It moves the process to the beginning of the loop
            if (input.equals("quit"))
                break; // It breaks out of the loop at that condition
            System.out.println(input);
        }

//        do {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));

        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);
    }
}
