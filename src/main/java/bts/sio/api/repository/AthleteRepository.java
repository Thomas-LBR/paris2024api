package bts.sio.api.repository;

import bts.sio.api.model.Athlete;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AthleteRepository extends CrudRepository<Athlete, Long> {

    Optional<Athlete> findByID(Long id);

    Iterable<Athlete> findALL();

    void deleteById();
}