package com.sofkaU.LogisticConcertDDD.soundengineer.values;

import co.com.sofka.domain.generic.Identity;

public class EquipmentID extends Identity {
    public EquipmentID(String uuid) {
        super(uuid);
    }

    public EquipmentID() {
    }

    public static EquipmentID of (String id){
        return new EquipmentID(id);
    }
}
