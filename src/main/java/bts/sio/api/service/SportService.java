package bts.sio.api.service;

import bts.sio.api.model.Athlete;
import bts.sio.api.model.Olympiade;
import bts.sio.api.model.Sport;
import bts.sio.api.repository.OlympiadeRepository;
import bts.sio.api.repository.SportRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Data
@Service
public class SportService {

    @Autowired
    private SportRepository sportRepository;

    public Optional<Sport> getSport(Long id) {
        return sportRepository.findById(id);
    }

    public ArrayList<Sport> getSports() {
        return (ArrayList<Sport>) sportRepository.findAll();
    }

    public void deleteSport(Long id) {
        sportRepository.deleteById(id);
    }

    public Sport saveSport(Sport sport) {
        return sportRepository.save(sport);
    }
}

