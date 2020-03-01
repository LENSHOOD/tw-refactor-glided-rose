package com.gildedrose.item;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AgedBrieTest {
    @Test
    void should_add_quality_when_quality_less_than_50_sell_in_greater_than_0() {
        AgedBrie agedBrie = new AgedBrie("AgedBrie", 2, 2);

        agedBrie.updateQuality();

        assertThat(agedBrie.getQuality(), is(3));
    }

    @Test
    void should_subtract_sell_in_when_update_quality() {
        AgedBrie agedBrie = new AgedBrie("AgedBrie", 2, 2);

        agedBrie.updateQuality();

        assertThat(agedBrie.getSellIn(), is(1));
    }

    @Test
    void should_add_quality_twice_when_quality_less_than_50_sell_in_less_than_0() {
        AgedBrie agedBrie = new AgedBrie("AgedBrie", 0, 2);

        agedBrie.updateQuality();

        assertThat(agedBrie.getQuality(), is(4));
    }
}