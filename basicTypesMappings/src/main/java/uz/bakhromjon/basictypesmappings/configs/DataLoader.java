package uz.bakhromjon.basictypesmappings.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.bakhromjon.basictypesmappings.entities.Hero;
import uz.bakhromjon.basictypesmappings.repositories.AnnualSubscriptionRepository;
import uz.bakhromjon.basictypesmappings.repositories.EventRepository;
import uz.bakhromjon.basictypesmappings.repositories.HeroRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private AnnualSubscriptionRepository annualSubscriptionRepository;
    @Autowired
    private HeroRepository heroRepository;

    @Override
    public void run(String... args) throws Exception {
//        Hero hero = new Hero(1L, "Fname", "Lname", "Mname1", "Mname2", "Mname3", "Mname4", "Mname5");
//        heroRepository.save(hero);
    }
}



