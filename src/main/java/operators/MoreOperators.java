package operators;

public class MoreOperators {

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 2;

        //if operator
        System.out.println("-----");
        System.out.println(firstNumber == secondNumber ? "Numbers are equal" : "Numbers are not equal");
        System.out.println(firstNumber > secondNumber ? "First number is greater" : "Second number is greater");
        System.out.println("-----");

        if (firstNumber == secondNumber){
            System.out.println("Numbers are equal");
        }else if (firstNumber > secondNumber){
            System.out.println("First number is greater");
        }else {
            System.out.println("Second number is greater");
        }

        System.out.println("------");
        printDaysOfTheWeek(14);
        System.out.println("------");

        printDaysInTheMonth(2, 2024);
        printDaysInTheMonth(2, 1900);
        printDaysInTheMonth(2, 2100);
        printDaysInTheMonth(2, 2016);
    }

    public static void printDaysOfTheWeek(int dayOfTheWeek){
        switch (dayOfTheWeek){
            case 1:
                System.out.println("Selected day is Monday");
                break;
            case 2:
                System.out.println("Selected day is Tuesday");
                break;
            case 3:
                System.out.println("Selected day is Wednesday");
                break;
            case 4:
                System.out.println("Selected day is ...");
                break;
            default:
                System.out.println("Please select a valid number!");
        }
    }

    public static void printDaysInTheMonth(int month, int year){
        int numberOfDays = 0;

        switch (month){
            case 1:
                numberOfDays = 31;
                System.out.printf("Selected Jan and it has %d\n", numberOfDays);
                break;
            case 2:
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                    numberOfDays = 29;
                    System.out.printf("Selected Feb and it has %d\n", numberOfDays);
                }else {
                    numberOfDays = 28;
                    System.out.printf("Selected Feb and it has %d\n", numberOfDays);
                }
                break;
            default:
                System.out.println("Please enter valid data!");
        }
    }
}
