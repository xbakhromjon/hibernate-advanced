package uz.bakhromjon.basictypesmappings.repositories;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.basictypesmappings.entities.AnnualSubscription;

@Repository
@Transactional
public interface AnnualSubscriptionRepository extends JpaRepository<AnnualSubscription, Long> {
}