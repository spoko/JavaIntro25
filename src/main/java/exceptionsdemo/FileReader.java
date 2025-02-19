package exceptionsdemo;

import java.io.*;

public class FileReader {

    public static void readFile(String fileName) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(fileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        String tmp; //= null;
        while ((tmp = bufferedReader.readLine()) != null){
            System.out.println(tmp);
        }

        bufferedReader.close();
        fileInputStream.close();
    }

    public static int divide2Numbers(int a, int b) throws CookieMonsterException{
        try {
            return a / b;
        }catch (ArithmeticException e){
            throw new CookieMonsterException(e.getMessage());
        }
    }
}
