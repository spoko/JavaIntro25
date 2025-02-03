package oop;

public class Dog extends Pet {
    public boolean isPlayful;

    public Dog(String name, byte age, Breed breed, Address address, boolean isMale) {
        super(name, age, breed, address, isMale);
    }

    //method overriding
    public void printDetails(){
        super.printDetails();
        System.out.printf("And the dog is %s%n", getDogLaziness());
    }

    //methods i.e. actions that any dog can "do"
    public void barf(){
        System.out.printf("%s is barfing...%n", getName());
    }

    //internal method i.e. can be accessed only from here
    private String getDogLaziness(){
        if (isPlayful){
            return "playful";
        }else {
            return "lazy";
        }
    }
}