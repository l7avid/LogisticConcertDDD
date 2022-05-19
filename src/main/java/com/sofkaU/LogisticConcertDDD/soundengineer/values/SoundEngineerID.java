package com.sofkaU.LogisticConcertDDD.soundengineer.values;

import co.com.sofka.domain.generic.Identity;

public class SoundEngineerID extends Identity {

    private SoundEngineerID() {
    }

    private SoundEngineerID(String uuid) {
        super(uuid);
    }

    public static SoundEngineerID of(String id){
        return new SoundEngineerID(id);
    }
}
