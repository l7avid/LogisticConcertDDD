package com.sofkaU.LogisticConcertDDD.soundengineer.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Brand implements ValueObject<String> {

    private final String brand;

    public Brand(String value) {
        this.brand = Objects.requireNonNull(value, "Brand cannot be null");
    }

    @Override
    public String value() {
        return brand;
    }
}
