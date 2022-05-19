package com.sofkaU.LogisticConcertDDD.soundengineer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Brand;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Model;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.SoundBoardID;

public class SoundBoardAdded extends DomainEvent {

    private final Brand brand;
    private final Model model;
    private final Integer volumeLevel;
    private final SoundBoardID entityID;


    public SoundBoardAdded(SoundBoardID entityID, Brand brand, Model model, Integer volumeLevel) {
        super("davidreina.soundboard.soundboardadded");
        this.brand = brand;
        this.model = model;
        this.entityID = entityID;
        this.volumeLevel = volumeLevel;
    }
    public SoundBoardID getEntityID(){
        return entityID;
    }

    public Integer volumeLevel() {
        return volumeLevel;
    }

    public Brand brand() {
        return brand;
    }

    public Model model() {
        return model;
    }
}
