package com.sofkaU.LogisticConcertDDD.soundengineer;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofkaU.LogisticConcertDDD.soundengineer.events.SoundBoardAdded;
import com.sofkaU.LogisticConcertDDD.soundengineer.events.SoundEngineerCreated;
import com.sofkaU.LogisticConcertDDD.soundengineer.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class SoundEngineer extends AggregateEvent<SoundEngineerID> {

    protected Name name;
    protected SoundBoard soundBoard;
    protected Set<Equipment> equipment;

    //This constructor is used when a soundengineer is created for the first time
    public SoundEngineer(SoundEngineerID entityID, Name name){
        super(entityID);
        appendChange(new SoundEngineerCreated(name)).apply();
    }

    //This constructor is cannot be used from outside, is used to subscribe to know the changes occurred
    private SoundEngineer(SoundEngineerID soundEngineerID){
        super(soundEngineerID);
        subscribe(new SoundEngineerChange(this));
    }

    //This constructor is used when we want to recreate a soundengineer that existed before with its events
    public static SoundEngineer from(SoundEngineerID soundEngineerID, List<DomainEvent> events){
        SoundEngineer soundEngineer = new SoundEngineer(soundEngineerID);
        events.forEach((event) -> soundEngineer.applyEvent(event));
        return soundEngineer;
    }

    public void addSoundBoard(SoundBoardID entityId, Brand brand, Model model){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(brand);
        Objects.requireNonNull(model);
        appendChange(new SoundBoardAdded(entityId, brand, model)).apply();
    }

    public Name name() {
        return name;
    }

    public SoundBoard soundBoard() {
        return soundBoard;
    }

    public Set<Equipment> equipmentList() {
        return equipment;
    }
}
