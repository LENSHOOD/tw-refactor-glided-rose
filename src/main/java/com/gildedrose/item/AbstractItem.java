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
}
