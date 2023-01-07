package uz.bakhromjon.json.entities;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import uz.bakhromjon.json.jsonObjects.Ticket;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Type(JsonType.class)
    @Column(columnDefinition = "json")
    private Ticket ticket;
    @ManyToOne
    private Event event;

}
