package data.types;

public class Dog {
    String name;
    byte age;
    String breed;
    static int dogCount;

    public String bark(){
        //local variable:
        String barkingSound = "bau bau bau";

        return name + ": " + barkingSound;
    }

    public void printDogDetails(){
        System.out.println("Dog name is: " + name);
        System.out.println("Dog age is: " + age);
        System.out.println("Dog breed is: " + breed);
    }

    public void printDogDetailsFormatted(){
        //System.out.println(String.format("Dog name is %s, age is %d and breed is %s.", name, age, breed));
        System.out.printf("Dog name is %s, age is %d and breed is %s.\n", name, age, breed);
    }
}
