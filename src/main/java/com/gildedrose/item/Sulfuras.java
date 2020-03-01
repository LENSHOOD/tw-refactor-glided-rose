package com.gildedrose.item;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Sulfuras:
 * @author zhangxuhai
 * @date 2020/3/1
*/
@AllArgsConstructor
@Getter
public class Sulfuras {
    private String name;

    private int sellIn;

    private int quality;

    public void updateQuality() {
        // do nothing
    }
}
