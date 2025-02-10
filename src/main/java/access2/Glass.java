package access2;

import access.Product;

public class Glass extends Product {
    public final String material = "glass";
    //special getter
    protected String getProtectedName(){
        return super.protectedName;
    }

//    public void printProductNames(){
//        System.out.println("Overwritten method");
//    } we cannot overwrite final methods
}
