package com.sofkaU.LogisticConcertDDD.soundengineer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Brand;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.EquipmentID;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.EquipmentType;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Model;

public class EquipmentAdded extends DomainEvent {

    private final Brand brand;
    private final Model model;
    private final EquipmentID entityID;
    private final EquipmentType equipmentType;


    public EquipmentAdded(EquipmentID equipmentID, Brand brand, Model model, EquipmentType equipmentType) {
        super("davidreina.equipment.equipmentdadded");
        this.brand = brand;
        this.model = model;
        this.entityID = equipmentID;
        this.equipmentType = equipmentType;
    }

    public EquipmentID getEntityID(){
        return entityID;
    }

    public Brand brand() {
        return brand;
    }

    public Model model() {
        return model;
    }

    public EquipmentType equipmentType() {
        return equipmentType;
    }
}
