package com.gildedrose;

import com.gildedrose.item.AbstractItem;
import com.gildedrose.item.GeneralItem;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class GildedRoseTest {

    @Test
    public void foo() {
        AbstractItem[] items = new AbstractItem[] { new GeneralItem("foo", 1, 5) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.getItems()[0].getName());
        assertThat(app.getItems()[0].getQuality(), is(4));
        assertThat(app.getItems()[0].getSellIn(), is(0));
    }
}
