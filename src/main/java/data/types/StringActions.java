package data.types;

public class StringActions {

    public static void main(String[] args) {
        String testString = "My test string";

        System.out.println(testString.charAt(2));//

        System.out.println(testString.contains("dfghdfgh"));
        System.out.println(testString.equals("my test string"));
        System.out.println(testString.length());//14

        String [] words = testString.split(" ");
        System.out.println("\"" + testString + "\"" + " has " + words.length + " words.");
    }
}
