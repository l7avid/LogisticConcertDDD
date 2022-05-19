package com.sofkaU.LogisticConcertDDD.soundengineer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Brand;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Model;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.SoundBoardID;

public class SoundBoardAdded extends DomainEvent {

    private final Brand brand;
    private final Model model;
    private final SoundBoardID entityID;


    public SoundBoardAdded(SoundBoardID entityID, Brand brand, Model model) {
        super("davidreina.soundboard.soundboardadded");
        this.brand = brand;
        this.model = model;
        this.entityID = entityID;
    }
    public SoundBoardID getEntityID(){
        return entityID;
    }

    public Brand brand() {
        return brand;
    }

    public Model model() {
        return model;
    }
}
