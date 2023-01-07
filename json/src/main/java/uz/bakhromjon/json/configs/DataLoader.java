package uz.bakhromjon.json.configs;

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
        User user = new User();
        user.setDetails(new UserDetails("Vlad", "Mihalcea", "info@vladmihalcea.com"));

        userRepository.save(user);
        user = userRepository.findById(1L).get();
    }
}
