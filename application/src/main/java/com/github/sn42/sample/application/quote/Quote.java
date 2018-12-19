package com.github.sn42.sample.application.quote;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Quote {
    private final String content;

    @JsonCreator
    public Quote(@JsonProperty("content") String content) {
        this.content = Objects.requireNonNull(content);
    }

    public String getContent() {
        return content;
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Quote other = (Quote) obj;
        return Objects.equals(this.content, other.content);
    }
}
