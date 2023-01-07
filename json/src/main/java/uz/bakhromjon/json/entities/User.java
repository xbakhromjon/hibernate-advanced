package uz.bakhromjon.json.entities;

import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.*;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import uz.bakhromjon.json.crypto.CryptoUtils;
import uz.bakhromjon.json.jsonObjects.UserDetails;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@DynamicUpdate
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String username;

    @Type(JsonType.class)
    @Column(columnDefinition = "json")
    private UserDetails details;

    @PrePersist
    @PreUpdate
    private void encryptFields() {
        if (details != null) {
            if (details.getFirstName() != null) {
                details.setFirstName(
                        CryptoUtils.encrypt(details.getFirstName())
                );
            }
            if (details.getLastName() != null) {
                details.setLastName(
                        CryptoUtils.encrypt(details.getLastName())
                );
            }
            if (details.getEmailAddress() != null) {
                details.setEmailAddress(
                        CryptoUtils.encrypt(details.getEmailAddress())
                );
            }
        }
    }

    @PostLoad
    private void decryptFields() {
        if (details != null) {
            if (details.getFirstName() != null) {
                details.setFirstName(
                        CryptoUtils.decrypt(details.getFirstName())
                );
            }
            if (details.getLastName() != null) {
                details.setLastName(
                        CryptoUtils.decrypt(details.getLastName())
                );
            }
            if (details.getEmailAddress() != null) {
                details.setEmailAddress(
                        CryptoUtils.decrypt(details.getEmailAddress())
                );
            }
        }
    }
}
