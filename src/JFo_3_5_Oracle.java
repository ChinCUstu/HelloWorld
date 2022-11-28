import javax.swing.*;

public class JFo_3_5_Oracle {

    public static void main(String[] args){
//        String = JOptionPane.showInputDialog("What is your name?");
//        System.out.println(string);
//        System.out.println(string);
//        int input = Integer.parseInt(JOptionPane.showInputDialog("Enter integer"));
//        System.out.println(input);

        String[] acceptableValues = {"Choice 1", "Choice 2","Choice 3"};
        String input2 = (String) JOptionPane.showInputDialog(null,
                "What's your choice?",
                "CIT211 Java",
                2,
                null,
                acceptableValues,
                acceptableValues[0]);
        System.out.println(input2);
    }
}
