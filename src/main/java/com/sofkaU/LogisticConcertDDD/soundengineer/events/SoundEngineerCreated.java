package com.sofkaU.LogisticConcertDDD.soundengineer.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.Name;

public class SoundEngineerCreated extends DomainEvent {

    private final Name name;

    public SoundEngineerCreated(Name name) {
        super("davidreina.soundengineer.soundengineercreated");
        this.name = name;
    }

    public Name name() {
        return name;
    }
}
