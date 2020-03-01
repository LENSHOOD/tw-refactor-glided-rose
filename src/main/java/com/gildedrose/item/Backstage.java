package com.gildedrose.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Backstage:
 * @author zhangxuhai
 * @date 2020/3/1
*/
@AllArgsConstructor
@Getter
public class Backstage {
    private String name;

    private int sellIn;

    private int quality;

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
