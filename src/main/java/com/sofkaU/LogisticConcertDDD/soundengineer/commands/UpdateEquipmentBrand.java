package com.sofkaU.LogisticConcertDDD.soundengineer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Brand;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.EquipmentID;

public class UpdateEquipmentBrand extends Command {

    private final EquipmentID entityID;
    private final Brand brand;


    public UpdateEquipmentBrand(EquipmentID entityID, Brand brand) {
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
