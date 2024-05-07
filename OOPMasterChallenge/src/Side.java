public class Side {
    private String type;
    private double price;

    public Side(String type) {
        this.type = type;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSidePrice(){
        switch (typeOfSide().toUpperCase()){
            default -> setPrice(4.00);
            case "SOUP" -> setPrice(5.40);
            case "SALAD" -> setPrice(6.80);
        }
        return price;
    }
    private String typeOfSide(){
        switch(getType().toUpperCase()){
            default -> setType("Fries");
            case "SALAD" -> setType("Salad");
            case "SOUP" -> setType("Soup");

        }
        return type;
    }

    @Override
    public String toString() {
        return "Side{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}