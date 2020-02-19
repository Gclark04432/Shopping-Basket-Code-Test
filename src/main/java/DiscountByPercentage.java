import java.util.ArrayList;

public class DiscountByPercentage {
    private ArrayList<Item> items;

    public DiscountByPercentage(){
        items = new ArrayList<Item>();
    }

    public int getItemsSize(){
        return this.items.size();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void discountItem(Item item, double percentageAmount) {
        for (Item itemToDiscount:this.items){
            if (itemToDiscount.equals(item)){
                itemToDiscount.setPrice(itemToDiscount.getPrice() * (1 - percentageAmount / 100));
            }
        }
    }
}
