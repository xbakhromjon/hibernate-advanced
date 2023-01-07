package uz.bakhromjon.json.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.bakhromjon.json.entities.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
