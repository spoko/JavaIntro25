package access;

public class Product {
    public String publicName;
    protected String protectedName;
    String defaultName;
    private String privateName;

    public final void printProductNames(){
        System.out.printf("Names are: %s, %s, %s, %s%n",protectedName, publicName, privateName, defaultName);
    }
}
