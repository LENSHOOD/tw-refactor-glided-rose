package com.gildedrose.item;

/**
 * AgedBrie:
 * @author zhangxuhai
 * @date 2020/3/1
*/
public class AgedBrie extends AbstractItem{
    public AgedBrie(int sellIn, int quality) {
        super("AgedBrie", sellIn, quality);
    }

    @Override
    public void updateQuality() {
        sellIn--;
        if (quality < 50) {
            quality++;

            if (sellIn < 0) {
                quality++;
            }
        }
    }
}
