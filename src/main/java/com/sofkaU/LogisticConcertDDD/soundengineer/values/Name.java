package com.sofkaU.LogisticConcertDDD.soundengineer.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {

    private final String name;

    public Name(String name) {
        boolean nameInvalid = false;
        char[] nameCharacters = name.toCharArray();
        for(char character : nameCharacters){
            if(Character.isDigit(character)){
                nameInvalid = true;
            }
        }
        if(nameInvalid){
            throw new Error("Name cannot contain numbers");
        }
        this.name = Objects.requireNonNull(name, "Name cannot be null");
    }

    @Override
    public String value() {
        return name;
    }
}
