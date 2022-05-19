package com.sofkaU.LogisticConcertDDD.soundengineer;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Brand;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Model;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.SoundBoardID;

import java.util.Objects;

public class SoundBoard extends Entity<SoundBoardID> {

    private Brand brand;
    private Model model;

    public SoundBoard(SoundBoardID entityId, Brand brand, Model model) {
        super(entityId);
        this.brand = brand;
        this.model = model;
    }

    public void updateBrand(Brand brand) {
        this.brand = Objects.requireNonNull(brand);
    }

    public void updateModel(Model model) {
        this.model = Objects.requireNonNull(model);
    }

    public Brand brand() {
        return brand;
    }

    public Model model() {
        return model;
    }
}
