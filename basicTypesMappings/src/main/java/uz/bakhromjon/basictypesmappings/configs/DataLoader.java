package uz.bakhromjon.basictypesmappings.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.bakhromjon.basictypesmappings.entities.Event;
import uz.bakhromjon.basictypesmappings.repositories.EventRepository;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private EventRepository eventRepository;

    @Override
    public void run(String... args) throws Exception {
        Event event1 = new Event(1L, '1');
        Event event2 = new Event(2L, null);

        eventRepository.saveAll(List.of(event1, event2));
    }
}
