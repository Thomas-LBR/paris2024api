package bts.sio.api.service;

import bts.sio.api.model.Athlete;
import bts.sio.api.model.Olympiade;
import bts.sio.api.model.Sport;
import bts.sio.api.repository.AthleteRepository;
import bts.sio.api.repository.SportRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Data
@Service
public class AthleteService {

    @Autowired
    private AthleteRepository athleteRepository;

    public Optional<Athlete> getAthlete(final Long id) {
        return athleteRepository.findByID(id);
    }

    public Iterable<Athlete> getAthletes() {
        return athleteRepository.findALL();
    }

    public void deleteAthlete(final Long id) {
        athleteRepository.deleteById();
    }

    public Athlete saveAthlete(Athlete athlete) {
        Athlete saveAthlete = athleteRepository.save(athlete);
        return saveAthlete;
    }

}