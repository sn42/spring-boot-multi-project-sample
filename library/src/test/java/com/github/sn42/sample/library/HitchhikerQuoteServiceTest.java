package com.github.sn42.sample.library;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HitchhikerQuoteServiceTest {
    HitchhikerQuoteService quoteService;

    @Before
    public void setUp() {
        this.quoteService = new HitchhikerQuoteService();
    }

    @Test
    public void shouldReturnQuote() {
        assertEquals("Don't Panic.", quoteService.getQuote());
    }
}