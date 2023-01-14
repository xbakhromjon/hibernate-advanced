package uz.bakhromjon.basictypesmappings.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Hero")
@Table(name = "heros")
public class Hero {

    @Id
    @GeneratedValue
    private Long id;


    private String firstName;

    private String lastName;

    private String middleName1;

    private String middleName2;

    private String middleName3;

    private String middleName4;

    private String middleName5;

//    @Generated( value = GenerationTime.ALWAYS )
//    @Column(columnDefinition =
//            "as concat(" +
//                    "    coalesce(firstName, ''), " +
//                    "    coalesce(' ' + middleName1, ''), " +
//                    "    coalesce(' ' + middleName2, ''), " +
//                    "    coalesce(' ' + middleName3, ''), " +
//                    "    coalesce(' ' + middleName4, ''), " +
//                    "    coalesce(' ' + middleName5, ''), " +
//                    "    coalesce(' ' + lastName, '') " +
//                    ")")
    private String fullName;


    public String getFullName() {
        return fullName;
    }
}