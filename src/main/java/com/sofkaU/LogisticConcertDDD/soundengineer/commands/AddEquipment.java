package com.sofkaU.LogisticConcertDDD.soundengineer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.*;

public class AddEquipment extends Command {

    private final SoundEngineerID soundEngineerID;
    private final EquipmentID entityID;
    private final Brand brand;
    private final Model model;
    private final EquipmentType equipmentType;


    public AddEquipment(SoundEngineerID soundEngineerID, EquipmentID entityID, Brand brand, Model model,
                        EquipmentType equipmentType) {
        this.soundEngineerID = soundEngineerID;
        this.entityID = entityID;
        this.brand = brand;
        this.model = model;
        this.equipmentType = equipmentType;
    }

    public SoundEngineerID soundEngineerID() {
        return soundEngineerID;
    }

    public EquipmentID entityID() {
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
