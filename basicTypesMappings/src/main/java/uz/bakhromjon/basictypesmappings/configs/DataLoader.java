package uz.bakhromjon.basictypesmappings.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.bakhromjon.basictypesmappings.entities.AnnualSubscription;
import uz.bakhromjon.basictypesmappings.repositories.AnnualSubscriptionRepository;
import uz.bakhromjon.basictypesmappings.repositories.EventRepository;

import java.time.LocalDateTime;
import java.time.MonthDay;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private AnnualSubscriptionRepository annualSubscriptionRepository;

    @Override
    public void run(String... args) throws Exception {
        AnnualSubscription annualSubscription = new AnnualSubscription(1L, 1, MonthDay.of(1, 1));
        annualSubscriptionRepository.save(annualSubscription);
    }
}



