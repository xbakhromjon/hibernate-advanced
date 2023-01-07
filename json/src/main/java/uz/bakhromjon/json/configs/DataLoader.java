package uz.bakhromjon.json.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.bakhromjon.json.entities.Event;
import uz.bakhromjon.json.entities.Location;
import uz.bakhromjon.json.repositories.EventRepository;
import uz.bakhromjon.json.repositories.ParticipantRepository;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private ParticipantRepository participantRepository;

    @Override
    public void run(String... args) throws Exception {
        Event event = new Event(1L, new Location("uzb", "tashkent"));
        event = eventRepository.save(event);

    }
}
