package access2;

import access.Product;

public class Test {
    public static void main(String[] args) {
        Product product1 = new Product();

        System.out.println(product1.publicName);
        //System.out.println(product1.protectedName); cannot be accessed directly
        //System.out.println(product1.defaultName); cannot be accessed at all

        Glass glass = new Glass();
        System.out.println(glass.publicName);
        System.out.println(glass.getProtectedName());
        //System.out.println(glass.defaultName);

        //glass.material = "metal"; cannot change something that is final
    }
}
