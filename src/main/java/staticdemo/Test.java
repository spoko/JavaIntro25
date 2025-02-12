package staticdemo;

public class Test {

    public static void main(String[] args) {
        System.out.println(Car.getCounter());//0

        Car vw = new Car("Red", "gasoline");

        System.out.println(Car.getCounter());//1
        System.out.println(vw.getCounter());//1

        Car bmw = new Car("Red", "diesel");

        System.out.println(bmw.getCounter());//2
        System.out.println(Car.getCounter());//2

        System.out.println(vw.getBrandName());//Toyota
        System.out.println(Car.getBrandName());//Toyota
        System.out.println(bmw.getBrandName());//Toyota

        System.out.println(Car.FOUR_WHEEL_DRIVE);
        //Car.FOUR_WHEEL_DRIVE = false; // we cannot change final variable after it`s initial initialization
    }
}
