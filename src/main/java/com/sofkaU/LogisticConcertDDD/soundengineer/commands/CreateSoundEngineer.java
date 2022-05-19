package com.sofkaU.LogisticConcertDDD.soundengineer.commands;

import co.com.sofka.domain.generic.Command;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Name;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.SoundEngineerID;

public class CreateSoundEngineer extends Command {

    private final SoundEngineerID soundEngineerID;
    private final Name name;


    public CreateSoundEngineer(SoundEngineerID soundEngineerID, Name name) {
        this.soundEngineerID = soundEngineerID;
        this.name = name;
    }

    public SoundEngineerID soundEngineerID() {
        return soundEngineerID;
    }

    public Name name() {
        return name;
    }
}
