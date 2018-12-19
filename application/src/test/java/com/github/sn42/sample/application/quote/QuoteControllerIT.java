package com.github.sn42.sample.application.quote;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class QuoteControllerIT {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void shouldReturnQuote() {
        Quote quote = restTemplate.getForObject("/quotes", Quote.class);
        assertEquals(new Quote("Don't Panic."), quote);
    }
}
