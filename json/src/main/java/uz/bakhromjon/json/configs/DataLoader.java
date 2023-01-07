package uz.bakhromjon.json.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.bakhromjon.json.entities.Book;
import uz.bakhromjon.json.jsonObjects.AmountDiscountCoupon;
import uz.bakhromjon.json.jsonObjects.BookRecord;
import uz.bakhromjon.json.jsonObjects.DiscountCoupon;
import uz.bakhromjon.json.jsonObjects.PercentageDiscountCoupon;
import uz.bakhromjon.json.repositories.BookRepository;
import uz.bakhromjon.json.repositories.EventRepository;
import uz.bakhromjon.json.repositories.ParticipantRepository;

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

    @Override
    public void run(String... args) throws Exception {
        Book book = new Book();
        List<DiscountCoupon> coupons = new ArrayList<>();
        coupons.add(new AmountDiscountCoupon("PPP", new BigDecimal("4.99")));
        coupons.add(new PercentageDiscountCoupon("Black Friday", BigDecimal.valueOf(0.02)));
        book.setCoupons(coupons);
        book = bookRepository.save(book);
    }
}
