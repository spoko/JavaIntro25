package encapsulation;

import java.util.LinkedList;

public class Person {
    private String name;
    private int money;
    private LinkedList<Product> bagOfProducts = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Error: invalid entry for name!");
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if(money >= 0){
            this.money = money;
        }else {
            System.out.println("Money cannot be negative");
        }
    }

    public Person(String name, int money){
        setName(name);
        setMoney(money);
    }

    public void buyProduct(Product product){
        if (this.money >= product.getCost()){
            this.bagOfProducts.add(product);
            this.setMoney(money - product.getCost());
            System.out.printf("%s bought %s%n", name, product.getName());
        }else {
            System.out.printf("%s can't afford %s%n", name, product.getName());
        }
    }

    public void printItemsInTheBag(){
        if (bagOfProducts.size() == 0){
            System.out.printf("%s Nothing bought%n", name);
            return;
        }

        String itemNames = "";
        for(Product product : bagOfProducts){
            if (bagOfProducts.size() > 1){
                itemNames += product.getName() + ", ";
            }else {
                itemNames += product.getName();
            }
        }

        itemNames = itemNames.trim();
        if (itemNames.lastIndexOf(",") == itemNames.length() - 1){
            itemNames = itemNames.substring(0, itemNames.length() - 1);
        }

        System.out.printf("%s - %s%n", name, itemNames);
    }
}
