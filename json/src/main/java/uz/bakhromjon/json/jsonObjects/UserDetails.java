package uz.bakhromjon.json.jsonObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
    private String firstName;

    private String lastName;

    private String emailAddress;
}
