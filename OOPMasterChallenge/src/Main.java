import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Bill's Burgers!\n" + "Select the type of DRINK you want:");
        System.out.println("Choose your drinks size and type");
        Drink drink = new Drink(scanner.nextLine(),scanner.nextLine());
        System.out.println("this drink costs: " + drink.getDrinkPrice());
        System.out.println("Select your side: ");
        Side side = new Side(scanner.nextLine());
        System.out.println("Yours side price is: " + side.getSidePrice());

        System.out.println("Do you want an option of a deluxe burger? ");
        switch (scanner.nextLine().toUpperCase()){
            case "Y" ->{
                System.out.println("Choose 5 of your toppings, to select less press ENTER AGAIN");
                Burger burgerDeluxe = new Deluxe("",15);
                burgerDeluxe.additionalItems();
                burgerDeluxe.burgerPrice();
                MealOrder mealOrder = new MealOrder(drink,side,burgerDeluxe);
                System.out.println("Your total is: ");
                mealOrder.orderPrice(true);
            }
            case "N" ->{
                System.out.println("Choose 3 of your toppings, to select less press ENTER AGAIN");
                Burger burger = new Burger(scanner.nextLine(),9.50);
                MealOrder mealOrder = new MealOrder(drink,side,burger);
                System.out.println("Your total is: ");
                mealOrder.orderPrice(false);
            }
        }












    }
}