public class MealOrder {
    private Drink drink;
    private Side side;
    private Burger burger;




    public MealOrder(Drink drink, Side side, Burger burger) {
        this.drink = drink;
        this.side = side;
        this.burger= burger;
    }



    public void orderPrice(boolean isDeluxe){
        double finalPrice;
        if(!isDeluxe) {
            finalPrice = drink.getDrinkPrice() + side.getSidePrice()+ burger.burgerPrice();
        }else{
            finalPrice = burger.burgerPrice() + drink.getDrinkPrice() + side.getSidePrice();
        }
        System.out.println(finalPrice);
    }

}