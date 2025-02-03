package oop;

public class Test {

    public static void main(String[] args) {
        Address sofia = new Address();
        sofia.setCity("Sofia");
        sofia.setPostalCode(1000);
        sofia.setStreetName("202");

        Breed germanShepard = new Breed();
        germanShepard.setName("German Shepard");
        germanShepard.setPossibleIllnesses("Lower back issues");
        germanShepard.setCharacteristics("Love to play and run");

        Dog dog1 = new Dog("Rocky", (byte) 7, germanShepard, sofia, true);

        dog1.isMale = true;
        dog1.printDetails();
        dog1.barf();
        dog1.eat();
        dog1.run();

        Dog dog2 = new Dog("some name", (byte) 2, germanShepard, sofia, false);
        dog2.printDetails();
        dog2.barf();
        dog2.eat();
        dog2.run();
    }
}
