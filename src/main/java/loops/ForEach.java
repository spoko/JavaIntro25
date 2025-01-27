package loops;

public class ForEach {

    public static void main(String[] args) {
        int [] numbers = {4, 5, 1024, 55555, 6666};
        String [] cities = {"Sofia", "Varna", "Plovdiv", "Burgas"};

        System.out.println(numbers);
        System.out.println(cities);

        System.out.println("------");

        for(int number : numbers){
            System.out.println(number);
        }

        System.out.println("------");

        for(String city : cities){
            System.out.println(city);
        }

        System.out.println("------");

        for(int i = 0; i < cities.length; i++){
            System.out.println(cities[i]);
        }

        System.out.println("------");

        for(int i = 0; i < numbers.length; i += 2){
            System.out.println(numbers[i]);
        }
    }
}
