package exceptionsdemo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws CookieMonsterException{
        try{
            FileReader.readFile("./src/main/resources/users.json");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage() + " 2nd exception");
        }finally {
            System.out.println("I will be always executed");
        }

        System.out.println("Will I be executed?");

        System.out.println(FileReader.divide2Numbers(2, 0));//0

        System.out.println("Will I be executed? part 2");//1
    }
}
