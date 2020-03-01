package com.gildedrose.item;

/**
 * GeneralItem:
 * @author zhangxuhai
 * @date 2020/3/1
*/
public class GeneralItem extends AbstractItem {
    public GeneralItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        sellIn--;

        subtractQuality();

        if (sellIn < 0) {
            subtractQuality();
        }
    }

    private void subtractQuality() {
        if (quality > 0) {
            quality--;
        }
    }
}
