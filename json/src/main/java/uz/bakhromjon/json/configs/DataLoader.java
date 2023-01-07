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

import java.util.HashMap;
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
        Book book = new Book();
        HashMap<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        book.setPropertiesMap(map);

        book = bookRepository.save(book);
    }
}
