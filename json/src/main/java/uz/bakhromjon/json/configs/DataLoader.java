package uz.bakhromjon.json.configs;

import com.vladmihalcea.hibernate.type.json.internal.JacksonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.bakhromjon.json.entities.Book;
import uz.bakhromjon.json.entities.Event;
import uz.bakhromjon.json.entities.Location;
import uz.bakhromjon.json.repositories.BookRepository;
import uz.bakhromjon.json.repositories.EventRepository;
import uz.bakhromjon.json.repositories.ParticipantRepository;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private ParticipantRepository participantRepository;
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        Event event = new Event();
        event.setLocation(new Location("uzb", "tashkent"));
        event.setAlternativeLocations(List.of(new Location("usa", "new-york"),
                new Location("uk", "london")));
        event = eventRepository.save(event);

    }
}
