package uz.bakhromjon.basictypesmappings.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.basictypesmappings.entities.Sensor;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, String> {
}