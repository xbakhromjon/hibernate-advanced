package uz.bakhromjon.json.entities;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import uz.bakhromjon.json.jsonObjects.Location;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Type(JsonType.class)
    @Column(columnDefinition = "json")
    private Location location;

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private List<Location> alternativeLocations = new ArrayList<Location>();

    public Event(Location location) {
        this.location = location;
    }
}
