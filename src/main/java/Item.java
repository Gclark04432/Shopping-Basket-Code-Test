public class Item {
    private String name;
    private String type;
    private double price;

    public Item(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return Math.round(price * 100.0)/100.0;
    }

    public void setPrice(Double newPrice){
        this.price = newPrice;
    }
}
