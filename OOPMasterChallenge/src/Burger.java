import java.util.Scanner;

public class Burger {
    private String type;
    private String items;
    private double price;



    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Burger(String type, double price) {
        this.type = type;
        this.price = price;
    }

public double burgerPrice(){
        return getPrice() + additionalItems();
}


    public double additionalItems(){
        Scanner scanner = new Scanner(System.in);
        int itemsLeft = 3;
        double itemsPriceCounter=0;
        while(itemsLeft>0){
            switch (scanner.nextLine().toUpperCase()) {
                default -> {
                    itemsLeft = -1;
                    itemsPriceCounter = 0;
                }
                case "SALAD" -> {
                    setPrice(2.20);
                    itemsPriceCounter += getPrice();
                }
                case "BACON" -> {
                    setPrice(3.00);
                    itemsPriceCounter += getPrice();
                }
                case "TOMATO" -> {
                    setPrice(1.50);
                    itemsPriceCounter += getPrice();
                }
            }


            itemsLeft--;
        }
        return itemsPriceCounter;
    }
}