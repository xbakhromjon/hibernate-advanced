package uz.bakhromjon.json.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.json.entities.Event;
import uz.bakhromjon.json.entities.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
