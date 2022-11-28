public class ControlFlow {

    public static void main(String[] args){
//        Comparison Operators
        int x = 1;
        int y = 1;
        System.out.println(x == y);// Boolean expression // true
        System.out.println(x != y);// Boolean expression // false

//        Logical Operators: &&, ||, not
       boolean hasHighIncome = false;
       boolean hasGoodCredit = true;
       boolean hasCriminalRecord = false;
       boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);
    }
}
