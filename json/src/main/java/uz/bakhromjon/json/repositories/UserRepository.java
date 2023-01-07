package uz.bakhromjon.json.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.json.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
