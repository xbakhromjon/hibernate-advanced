package uz.bakhromjon.basictypesmappings.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.basictypesmappings.entities.Event;

@Repository
@Transactional
public interface EventRepository extends JpaRepository<Event, Long> {
}