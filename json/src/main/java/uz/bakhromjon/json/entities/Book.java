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
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.Type;
import uz.bakhromjon.json.jsonObjects.BookRecord;
import uz.bakhromjon.json.jsonObjects.DiscountCoupon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicUpdate
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    @NaturalId
    private String isbn;

    private String title;
    private String author;

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private String properties;

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private JsonNode propertiesJson;

    @Type(JsonType.class)
    @Column(columnDefinition = "JSON")
    private BookRecord propertiesRecord;

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private Map<String, String> propertiesMap = new HashMap<>();

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private List<DiscountCoupon> coupons = new ArrayList<>();
}
