package staticdemo;

public class Car extends DriveCar {//if class is final it won`t be possible to be extended
    private String color;//non static variable
    private static int counter;//static variable
    private String engineType;
    private static String brandName;
    public final static boolean FOUR_WHEEL_DRIVE;// = true;
    private final String location;// = "Sofia";

    static {
        System.out.println("Calling static initializer...");
        brandName = "Toyota";
        FOUR_WHEEL_DRIVE = true;
    }

    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.isEmpty()){
            this.color = color;
        }else {
            System.out.println("Error: invalid entry for color!");
        }
    }

    public static int getCounter() {
        return counter;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        if (!engineType.isEmpty()){
            this.engineType = engineType;
        }else {
            System.out.println("Error: invalid entry for engine type!");
        }
    }

    public static String getBrandName() {
        return brandName;
    }

    //Constructors
    public Car(String color, String engineType){
        System.out.println("Calling constructor...");
        setColor(color);
        setEngineType(engineType);
        counter++;
        location = "Sofia";
    }

    //methods
    public final void printDetails(){//we cannot overwrite final method
        System.out.printf("This car has %s color and the engine type is %s.%n", color, engineType);
    }

    @Override
    public void flyForward() {
        System.out.println("Fly forward");
    }

    @Override
    public void flyBackward() {
        System.out.println("Fly backward");
    }
}
