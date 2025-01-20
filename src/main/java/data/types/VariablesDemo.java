package data.types;

public class VariablesDemo {

    public static void main(String[] args) {
        //all variables defined here are local:
        //primitive types i.e. stored in the stack memory:
        byte age = 127;
        char someRandomChar = '6';
        double salary = 1066.65;

        //referent types
        String greeting = "Hello world";
        Dog frenchBulldog = new Dog();
        Dog sharo = new Dog();

        frenchBulldog.name = "Morti";
        frenchBulldog.age = 4;
        frenchBulldog.breed = "French Bulldog";

        //testing
        System.out.println(age);//127
        System.out.println(someRandomChar);//6
        System.out.println(salary);//1066.65

        System.out.println(greeting);//Hello world
        System.out.println(frenchBulldog);//new Dog

        System.out.println(frenchBulldog.age);//4
        System.out.println(frenchBulldog.name);//Morti
        System.out.println(frenchBulldog.breed);//French Bulldog

        System.out.println(frenchBulldog.bark());
        frenchBulldog.printDogDetails();

        System.out.println("Sharo details:");
        sharo.printDogDetails();//

        System.out.println("-------------------");

        Dog.dogCount = 2;
        System.out.println(frenchBulldog.dogCount);//0
        System.out.println(sharo.dogCount);//0
        System.out.println(Dog.dogCount);//2
    }
}
