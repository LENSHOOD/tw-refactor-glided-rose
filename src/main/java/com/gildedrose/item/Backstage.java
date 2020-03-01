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
        if (quality < 50) {
            quality++;

            if (sellIn < 11) {
                quality++;
            }

            if (sellIn < 6) {
                quality++;
            }

            if (sellIn < 0) {
                quality = 0;
            }
        }
    }
}
