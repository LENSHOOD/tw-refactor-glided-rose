package com.gildedrose.item;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

class SulfurasTest {
    @Test
    void should_do_nothing_when_update_quality() {
        Sulfuras sulfuras = new Sulfuras("Sulfuras, Hand of Ragnaros", 1, 1);

        sulfuras.updateQuality();

        assertThat(sulfuras.getQuality(), is(1));
        assertThat(sulfuras.getSellIn(), is(1));
    }
}