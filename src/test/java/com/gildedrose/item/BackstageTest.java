package com.gildedrose.item;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

class BackstageTest {
    @Test
    void should_add_quality_when_quality_less_than_50_sell_in_greater_than_11() {
        Backstage backstage = new Backstage("Backstage passes to a TAFKAL80ETC concert", 12, 2);

        backstage.updateQuality();

        assertThat(backstage.getQuality(), is(3));
    }

    @Test
    void should_add_quality_twice_when_quality_less_than_50_sell_in_greater_than_6() {
        Backstage backstage = new Backstage("Backstage passes to a TAFKAL80ETC concert", 7, 2);

        backstage.updateQuality();

        assertThat(backstage.getQuality(), is(4));
    }

    @Test
    void should_add_quality_three_times_when_quality_less_than_50_sell_in_greater_than_0() {
        Backstage backstage = new Backstage("Backstage passes to a TAFKAL80ETC concert", 1, 2);

        backstage.updateQuality();

        assertThat(backstage.getQuality(), is(5));
    }

    @Test
    void should_set_quality_to_zero_when_quality_less_than_50_sell_in_less_than_0() {
        Backstage backstage = new Backstage("Backstage passes to a TAFKAL80ETC concert", 0, 2);

        backstage.updateQuality();

        assertThat(backstage.getQuality(), is(0));
    }

    @Test
    void should_subtract_sell_in_when_update_quality() {
        Backstage backstage = new Backstage("Backstage passes to a TAFKAL80ETC concert", 1, 2);

        backstage.updateQuality();

        assertThat(backstage.getSellIn(), is(0));
    }
}