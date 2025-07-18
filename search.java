package com.hoenscanner.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Search {
    @JsonProperty
    private String city;

    public String getCity() {
        return city;
    }
}
