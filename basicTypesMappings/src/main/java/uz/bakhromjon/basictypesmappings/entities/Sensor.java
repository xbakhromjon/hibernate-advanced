package uz.bakhromjon.basictypesmappings.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GeneratorType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.basictypesmappings.generators.LoggedUserGenerator;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Sensor")
@Table(name = "sensor")
public class Sensor {

    @Id
    @Column(name = "sensor_name")
    private String name;

    @Column(name = "sensor_value")
    private String value;

    @Column(name = "created_by")
    @GeneratorType(
            type = LoggedUserGenerator.class,
            when = GenerationTime.INSERT
    )
    private String createdBy;

    @Column(name = "updated_by")
    @GeneratorType(
            type = LoggedUserGenerator.class,
            when = GenerationTime.ALWAYS
    )
    private String updatedBy;

    public Sensor(String name, String value) {
        this.name = name;
        this.value = value;
    }
}

