import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {
    private Item item;

    @Before
    public void before(){
        item = new Item("Powerade", "Drink", 1.35);
    }

    @Test
    public void hasName(){
        assertEquals("Powerade", item.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Drink", item.getType());
    }

    @Test
    public void hasPrice(){
        assertEquals(1.35, item.getPrice(), 0.01);
    }

    @Test
    public void setPrice(){
        item.setPrice(1.50);
        assertEquals(1.50, item.getPrice(), 0.01);
    }

}
