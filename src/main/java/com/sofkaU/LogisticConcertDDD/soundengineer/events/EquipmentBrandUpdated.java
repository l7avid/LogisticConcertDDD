package com.sofkaU.LogisticConcertDDD.soundengineer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.*;

public class EquipmentBrandUpdated extends DomainEvent {

    private final EquipmentID entityID;
    private final Brand brand;


    public EquipmentBrandUpdated(EquipmentID entityID, Brand brand) {
        super("davidreina.equipment.equipmentbrandupdated");
        this.entityID = entityID;
        this.brand = brand;
    }

    public EquipmentID entityID() {
        return entityID;
    }

    public Brand brand() {
        return brand;
    }
}
