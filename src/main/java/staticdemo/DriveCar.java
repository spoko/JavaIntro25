package staticdemo;

public abstract class DriveCar {
    public void driveForward(){
        System.out.println("Moving forward...");
    }

    public void driveBackward(){
        System.out.println("Moving backwards...");
    }

    public abstract void flyForward();
    public abstract void flyBackward();
}
