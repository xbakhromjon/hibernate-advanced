package uz.bakhromjon.basictypesmappings.entities;

import io.hypersistence.utils.hibernate.type.basic.NullableCharacterType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Event")
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue
    private Long id;

    @Type(NullableCharacterType.class)
    @Column(name = "event_type")
    private Character type;
}