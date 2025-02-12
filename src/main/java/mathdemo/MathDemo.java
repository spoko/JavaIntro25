package mathdemo;

import java.util.Random;

public class MathDemo {

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println("Numbers for 6 from 49 are:");
        System.out.print(random.nextInt(1, 49) + ", ");
        System.out.print(random.nextInt(1, 49) + ", ");
        System.out.print(random.nextInt(1, 49) + ", ");
        System.out.print(random.nextInt(1, 49) + ", ");
        System.out.print(random.nextInt(1, 49) + ", ");
        System.out.print(random.nextInt(1, 49));
        System.out.println();


        System.out.println(findTriangleAreaByTwoSidesAndAngle(3, 4, 90));
    }

    public static double findTriangleAreaByTwoSidesAndAngle(int a, int b, double angle){
        return 0.5 * a * b * Math.sin(Math.toRadians(angle));
    }
}
