package operators;

public class ArithmeticOperations {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 7;

        System.out.println(firstNumber + secondNumber);//11
        System.out.println(secondNumber / firstNumber);//1
        System.out.println(firstNumber * secondNumber);//28
        System.out.println(secondNumber % firstNumber);//3

        System.out.println("-------");
        System.out.println(firstNumber--);//4
        System.out.println(firstNumber);//3

        System.out.println(++secondNumber);//8
        System.out.println(secondNumber);//8
    }
}
