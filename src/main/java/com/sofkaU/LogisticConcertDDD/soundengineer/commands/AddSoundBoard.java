package com.sofkaU.LogisticConcertDDD.soundengineer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Brand;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Model;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.SoundBoardID;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.SoundEngineerID;

public class AddSoundBoard extends Command{

    private final SoundEngineerID soundEngineerID;
    private final SoundBoardID entityID;
    private final Brand brand;
    private final Model model;

    public AddSoundBoard(SoundEngineerID soundEngineerID, SoundBoardID entityID, Brand brand, Model model) {
        this.soundEngineerID = soundEngineerID;
        this.entityID = entityID;
        this.brand = brand;
        this.model = model;
    }

    public SoundEngineerID soundEngineerID() {
        return soundEngineerID;
    }

    public SoundBoardID entityID() {
        return entityID;
    }

    public Brand brand() {
        return brand;
    }

    public Model model() {
        return model;
    }
}
