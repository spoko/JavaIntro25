package oop;

public class Cat extends Pet {
    public Cat(String name, byte age, Breed breed, Address address, boolean isMale) {
        super(name, age, breed, address, isMale);
    }

    public void meow(){
        System.out.printf("%s is meowing...", getName());
    }

    //method overloading
    public void meow(String name){
        System.out.printf("%s is meowing...", getName());
    }
}
