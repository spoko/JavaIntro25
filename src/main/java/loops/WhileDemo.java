package loops;

public class WhileDemo {

    public static void main(String[] args) {
        int number = 0;

        while (number <= 2){
            System.out.printf("Current number is %d\n", number);
            number++;
        }

        System.out.println("----------------");
        printFactorial(5);
        printFactorial(0);
        printFactorial(1);
        printFactorial(2);

    }

    public static void printFactorial(int n){
        int factorial = 1;
        int counter = n;

        while (counter > 0){
            factorial *= counter;
            counter--;
        }

        System.out.printf("You have entered %d. %d! = %d.\n", n, n, factorial);
    }
}
