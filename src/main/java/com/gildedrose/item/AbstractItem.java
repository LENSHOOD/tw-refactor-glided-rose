package com.gildedrose.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * AbstractItem:
 * @author zhangxuhai
 * @date 2020/3/1
*/
@AllArgsConstructor
@Getter
public abstract class AbstractItem {
    protected String name;

    protected int sellIn;

    protected int quality;

    public abstract void updateQuality();

    void addQuality() {
        if (quality < 50) {
            quality++;
        }
    }

    void subtractQuality() {
        if (quality > 0) {
            quality--;
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
