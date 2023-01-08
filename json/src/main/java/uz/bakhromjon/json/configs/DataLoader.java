package uz.bakhromjon.json.configs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceUnit;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.bakhromjon.json.entities.Book;
import uz.bakhromjon.json.entities.User;
import uz.bakhromjon.json.jsonObjects.*;
import uz.bakhromjon.json.repositories.BookRepository;
import uz.bakhromjon.json.repositories.EventRepository;
import uz.bakhromjon.json.repositories.ParticipantRepository;
import uz.bakhromjon.json.repositories.UserRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
@PersistenceUnit
public class DataLoader implements CommandLineRunner {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private ParticipantRepository participantRepository;
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        Book book = new Book();
        book.setIsbn("978-9730228236");
        book.setProperties("{" +
                "   \"title\": \"High-Performance Java Persistence\"," +
                "   \"author\": \"Vlad Mihalcea\"," +
                "   \"publisher\": \"Amazon\"," +
                "   \"price\": 44.99" +
                "}");
        book.setAuthor("Vlad Mihalcea");

        book = bookRepository.save(book);
        book.setTitle(
                "High-Performance Java Persistence, 2nd edition"
        );
        bookRepository.save(book);

    }
}
