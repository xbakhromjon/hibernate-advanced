package uz.bakhromjon.json.entities;

import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.Type;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    @NaturalId
    private String isbn;

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private String properties;

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private JsonNode propertiesJson;
}
