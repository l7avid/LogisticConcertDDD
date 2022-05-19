package com.sofkaU.LogisticConcertDDD.soundengineer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Brand;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.SoundBoardID;

public class SoundBoardBrandUpdated extends DomainEvent {

    private final SoundBoardID entityID;
    private final Brand brand;


    public SoundBoardBrandUpdated(SoundBoardID entityID, Brand brand) {
        super("davidreina.soundboard.soundboardbrandupdated");
        this.entityID = entityID;
        this.brand = brand;
    }

    public SoundBoardID entityID() {
        return entityID;
    }

    public Brand brand() {
        return brand;
    }
}
