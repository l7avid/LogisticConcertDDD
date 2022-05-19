package com.sofkaU.LogisticConcertDDD.soundengineer;

import co.com.sofka.domain.generic.Entity;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Brand;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.EquipmentID;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.EquipmentType;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Model;

import java.util.Objects;

public class Equipment extends Entity<EquipmentID> {

    private Brand brand;
    private Model model;
    private EquipmentType equipmentType;


    public Equipment(EquipmentID entityId, Brand brand, Model model, EquipmentType equipmentType) {
        super(entityId);
        this.brand = brand;
        this.model = model;
        this.equipmentType = equipmentType;
    }

    public void updateBrand(Brand brand){
        this.brand = Objects.requireNonNull(brand);
    }

    public void updateModel(Model model){
        this.model = Objects.requireNonNull(model);
    }

    public void updateEquipmentType(EquipmentType equipmentType){
        this.equipmentType = equipmentType;
    }
}
