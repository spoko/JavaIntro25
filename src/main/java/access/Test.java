package access;

public class Test {
    public static void main(String[] args) {
        Product product1 = new Product();

        System.out.println(product1.publicName);
        System.out.println(product1.protectedName);
        System.out.println(product1.defaultName);
    }
}
