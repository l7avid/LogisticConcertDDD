package com.sofkaU.LogisticConcertDDD.soundengineer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Brand;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.SoundBoardID;

public class UpdateSoundBoardBrand extends Command {

    private final SoundBoardID entityID;
    private final Brand brand;


    public UpdateSoundBoardBrand(SoundBoardID soundBoardID, Brand brand) {
        this.entityID = soundBoardID;
        this.brand = brand;
    }

    public SoundBoardID entityID() {
        return entityID;
    }

    public Brand brand() {
        return brand;
    }
}
