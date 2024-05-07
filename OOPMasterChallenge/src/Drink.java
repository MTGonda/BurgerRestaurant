public class Drink  {
    private String size;
    private String type;
    private double price;

    public Drink(String size, String type) {
        this.size = size;
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    public double getDrinkPrice(){

        switch (sizeChoice().toUpperCase()) {

                default -> {
                    typeChoice();
                    setPrice(4.00);
                }
                case "MEDIUM" -> {
                    typeChoice();
                    setPrice(5.40);
                }
                case "LARGE" -> {
                    typeChoice();
                    setPrice(6.80);
                }
        }
        return price;
    }

    public String sizeChoice(){
        switch(getSize().toUpperCase()){
            default -> setSize("Small");
            case "LARGE" -> setSize("Large");
            case "MEDIUM" -> setSize("Medium");
        }
        return size;
    }

    public String typeChoice(){
        switch (getType().toUpperCase()){
            default -> setType("Cola");
            case "FANTA" -> setType("Fanta");
            case "SPRITE" -> setType("Sprite");
        }
        return type;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "size='" + size + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}