package com.sofkaU.LogisticConcertDDD.soundengineer;

import co.com.sofka.domain.generic.EventChange;
import com.sofkaU.LogisticConcertDDD.soundengineer.events.EquipmentAdded;
import com.sofkaU.LogisticConcertDDD.soundengineer.events.SoundBoardAdded;
import com.sofkaU.LogisticConcertDDD.soundengineer.events.SoundEngineerCreated;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SoundEngineerChange extends EventChange {

    public SoundEngineerChange(SoundEngineer soundEngineer) {

        List<String> validEquipment = Arrays.asList("Microphone","Amplifier", "Line");

        apply((SoundEngineerCreated event) -> {
            soundEngineer.name = event.name();
            soundEngineer.equipment = new HashSet<>();
        });

        apply((SoundBoardAdded event) ->{
            var soundBoardBrand = event.brand();
            var soundBoardModel = event.model();
            var soundBoardVolumeLevel = event.volumeLevel();
            if (soundBoardBrand == null || soundBoardModel == null){
                throw new IllegalArgumentException("SoundBoard parameter cannot be null");
            }
            if (soundBoardVolumeLevel <= 0){
                throw new IllegalArgumentException("SoundBoard volume cannot be less than zero");
            }
            SoundBoard soundBoard = new SoundBoard(event.getEntityID(),event.brand(),event.model(), event.volumeLevel());
        });

        apply((EquipmentAdded event) -> {
            boolean isAValidEquipment = validEquipment.contains(event.equipmentType());
            if (!isAValidEquipment){
                throw new IllegalArgumentException("Invalid equipment");
            }
            soundEngineer.equipment.add(new Equipment(event.getEntityID(),event.brand(), event.model(),
                    event.equipmentType()));
        });


    }

}
