package com.gildedrose.item;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class AbstractItemTest {
    private AbstractItem item;

    @BeforeEach
    void init() {
        item = new AbstractItem("test", 2, 2) {
            @Override
            public void updateQuality() {
                ;
            }
        };
    }

    @Test
    void should_add_quality_when_quality_less_than_50() {
        item.addQuality();

        assertThat(item.quality, is(3));
    }

    @Test
    void should_subtract_quality_when_quality_greater_than_0() {
        item.subtractQuality();

        assertThat(item.quality, is(1));
    }

    @Test
    void should_do_nothing_when_quality_greater_than_50() {
        item.quality = 50;

        item.addQuality();

        assertThat(item.quality, is(50));
    }

    @Test
    void should_do_nothing_when_quality_less_than_0() {
        item.quality = 0;

        item.subtractQuality();

        assertThat(item.quality, is(0));
    }

}