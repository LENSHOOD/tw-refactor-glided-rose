package com.gildedrose.item;

/**
 * Sulfuras:
 * @author zhangxuhai
 * @date 2020/3/1
*/
public class Sulfuras extends AbstractItem {
    public Sulfuras(int sellIn, int quality) {
        super("Sulfuras, Hand of Ragnaros", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        // do nothing
    }
}
