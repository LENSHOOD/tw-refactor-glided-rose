package com.gildedrose.item;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class GeneralItemTest {
    @Test
    void should_subtract_quality_when_quality_greater_than_0_sell_in_greater_than_0() {
        GeneralItem generalItem = new GeneralItem("Elixir of the Mongoose", 2, 2);

        generalItem.updateQuality();

        assertThat(generalItem.getQuality(), is(1));
    }

    @Test
    void should_subtract_quality_twice_when_quality_greater_than_0_sell_in_less_than_0() {
        GeneralItem generalItem = new GeneralItem("Elixir of the Mongoose", 0, 2);

        generalItem.updateQuality();

        assertThat(generalItem.getQuality(), is(0));
    }

    @Test
    void should_subtract_sell_in_when_update_quality() {
        GeneralItem generalItem = new GeneralItem("Elixir of the Mongoose", 2, 2);

        generalItem.updateQuality();

        assertThat(generalItem.getSellIn(), is(1));
    }
}