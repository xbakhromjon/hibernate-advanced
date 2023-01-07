package uz.bakhromjon.json.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.json.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
