package com.sofkaU.LogisticConcertDDD.soundengineer.values;

import co.com.sofka.domain.generic.Identity;
import com.sofkaU.LogisticConcertDDD.soundengineer.SoundBoard;

public class SoundBoardID extends Identity {

    public SoundBoardID() {
    }

    private SoundBoardID(String uuid) {
        super(uuid);
    }

    public static SoundBoardID of (String id){
        return new SoundBoardID(id);
    }
}
