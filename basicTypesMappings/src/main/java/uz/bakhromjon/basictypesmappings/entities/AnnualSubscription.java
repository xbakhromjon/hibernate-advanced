package uz.bakhromjon.basictypesmappings.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.MonthDay;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.basictypesmappings.converter.MonthDayDateAttributeConverter;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "AnnualSubscription")
@Table(name = "annual_subscription")
public class AnnualSubscription {

    @Id
    private Long id;

    @Column(
            name = "price_in_cents"
    )
    private int priceInCents;

    @Column(
            name = "payment_day",
            columnDefinition = "date"
    )
    @Convert(
            converter = MonthDayDateAttributeConverter.class
    )
    private MonthDay paymentDay;

    public AnnualSubscription setId(
            Long id) {
        this.id = id;
        return this;
    }


    public AnnualSubscription setPriceInCents(
            int priceInCents) {
        this.priceInCents = priceInCents;
        return this;
    }

    public AnnualSubscription setPaymentDay(
            MonthDay paymentDay) {
        this.paymentDay = paymentDay;
        return this;
    }
}