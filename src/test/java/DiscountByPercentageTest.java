import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountByPercentageTest {
    private DiscountByPercentage discountByPercentage;
    private Item item;

    @Before
    public void before(){
        this.discountByPercentage = new DiscountByPercentage();
        this.item = new Item("Powerade", "Drink", 1.35);
    }

    @Test
    public void startsWithNoItems(){
        assertEquals(0, discountByPercentage.getItemsSize());
    }

    @Test
    public void canAddItem(){
        discountByPercentage.addItem(this.item);
        assertEquals(1, discountByPercentage.getItemsSize());
    }

    @Test
    public void canGetItemPrice(){
        assertEquals(1.35, item.getPrice(), 0.0);
    }

    @Test
    public void canApplyDiscountToItemPrice(){
        discountByPercentage.addItem(this.item);
        discountByPercentage.discountItem(item, 10);
        assertEquals(1.22, item.getPrice(), 0.001);
    }
}
