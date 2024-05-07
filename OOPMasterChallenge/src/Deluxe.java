import java.util.Scanner;

public class Deluxe extends Burger{


    public Deluxe(String type, double price) {
        super(type, price);
    }

    @Override
    public double burgerPrice() {

        return getPrice();
    }

    @Override
    public double additionalItems() {
        Scanner scanner = new Scanner(System.in);
        int itemsLeft = 5;
        while(itemsLeft>0){
            switch (scanner.nextLine().toUpperCase()) {
                default -> itemsLeft = -1;
                case "SALAD" -> setItems("Salad");
                case "BACON" -> setItems("Bacon");
                case "TOMATO" -> setItems("Tomato");
            }

            System.out.println("Item selected: " + getItems());
            itemsLeft--;
        }
        return getPrice();
    }
}