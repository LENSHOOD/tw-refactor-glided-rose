package com.gildedrose.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * AgedBrie:
 * @author zhangxuhai
 * @date 2020/3/1
*/
@Getter
@AllArgsConstructor
public class AgedBrie {
    private String name;

    private int sellIn;

    private int quality;

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
