package uz.bakhromjon.basictypesmappings.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.bakhromjon.basictypesmappings.entities.Sensor;
import uz.bakhromjon.basictypesmappings.auth.LoggedUser;
import uz.bakhromjon.basictypesmappings.repositories.AnnualSubscriptionRepository;
import uz.bakhromjon.basictypesmappings.repositories.EventRepository;
import uz.bakhromjon.basictypesmappings.repositories.HeroRepository;
import uz.bakhromjon.basictypesmappings.repositories.SensorRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private AnnualSubscriptionRepository annualSubscriptionRepository;
    @Autowired
    private HeroRepository heroRepository;
    @Autowired
    private SensorRepository sensorRepository;

    @Override
    public void run(String... args) throws Exception {
        LoggedUser.logIn("Bob");
        Sensor sensor = new Sensor("ip", "192.168.0.101");
        sensorRepository.save(sensor);
    }
}



