package uz.bakhromjon.basictypesmappings.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.basictypesmappings.entities.Hero;

@Repository
public interface HeroRepository extends JpaRepository<Hero, Long> {
}