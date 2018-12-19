package com.github.sn42.sample.library;

import org.springframework.stereotype.Service;

@Service
public class HitchhikerQuoteService implements QuoteService {
    @Override
    public String getQuote() {
        return "Don't Panic.";
    }
}