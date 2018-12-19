package com.github.sn42.sample.application.quote;

import java.util.Objects;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.sn42.sample.library.QuoteService;

@RestController
@RequestMapping("/quotes")
public class QuoteController {
    private final QuoteService quoteService;

    public QuoteController(QuoteService quoteService) {
        this.quoteService = Objects.requireNonNull(quoteService);
    }

    @GetMapping
    public Quote getQuote() {
        String content = quoteService.getQuote();
        return new Quote(content);
    }
}
