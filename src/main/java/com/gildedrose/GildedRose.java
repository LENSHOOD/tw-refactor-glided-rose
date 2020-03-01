package com.gildedrose;

import com.gildedrose.item.AbstractItem;
import com.google.common.collect.ImmutableList;

import java.util.Arrays;

class GildedRose {
    private ImmutableList<AbstractItem> items;

    public GildedRose(AbstractItem[] items) {
        this.items = ImmutableList.copyOf(Arrays.copyOf(items, items.length));
    }

    public void updateQuality() {
        items.forEach(AbstractItem::updateQuality);
    }

    public AbstractItem[] getItems() {
        return Arrays.copyOf(items.toArray(new AbstractItem[0]), items.size());
    }
}
