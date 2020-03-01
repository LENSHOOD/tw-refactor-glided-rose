package com.gildedrose.item;

/**
 * Backstage:
 * @author zhangxuhai
 * @date 2020/3/1
*/
public class Backstage extends AbstractItem {
    public Backstage(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        sellIn--;

        addQuality();

        if (sellIn < 11) {
            addQuality();
        }

        if (sellIn < 6) {
            addQuality();
        }

        if (sellIn < 0) {
            quality = 0;
        }
    }
}
