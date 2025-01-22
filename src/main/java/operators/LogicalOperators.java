package operators;

public class LogicalOperators {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        boolean result = false;

        System.out.println(!result);//true

        result = (num1 < num2) && !(num1 > num2);
        System.out.println(result);//true

        result = (num1 < num2) && (num1 > num2);
        System.out.println(result);//false

        result = (num1 > num2) || (num2 <= num1);
        System.out.println(result);//false

        result = (num1 < num2) || (num1 > num2);
        System.out.println(result);//true
    }
}
