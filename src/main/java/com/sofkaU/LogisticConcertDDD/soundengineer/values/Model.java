package com.sofkaU.LogisticConcertDDD.soundengineer.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Model implements ValueObject<String> {

    private final String model;

    public Model(String model) {
        this.model = Objects.requireNonNull(model, "Model cannot be null");
    }

    @Override
    public String value() {
        return model;
    }
}
