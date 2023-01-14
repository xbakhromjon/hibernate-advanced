package uz.bakhromjon.basictypesmappings.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Formula;

import java.sql.Timestamp;

@Entity(name = "Account")
@Table(name = "account")
public class Account {

    @Id
    private Long id;

    @ManyToOne
    private User owner;


    private String iban;
    private long cents;
    private double interestRate;


    @Formula("cents::numeric / 100")
    private double dollars;

    @Formula(
            "round(" +
                    "   (interestRate::numeric / 100) * " +
                    "   cents * " +
                    "   date_part('month', age(now(), createdOn)" +
                    ") " +
                    "/ 12)")
    private long interestCents;

    @Formula(
            "round(" +
                    "   (interestRate::numeric / 100) * " +
                    "   cents * " +
                    "   date_part('month', age(now(), createdOn)" +
                    ") " +
                    "/ 12) " +
                    "/ 100::numeric")
    private double interestDollars;



    private Timestamp createdOn;

    public Account() {
    }

    public Account(
            Long id, User owner, String iban,
            long cents, double interestRate, Timestamp createdOn) {
        this.id = id;
        this.owner = owner;
        this.iban = iban;
        this.cents = cents;
        this.interestRate = interestRate;
        this.createdOn = createdOn;
    }



    @Transient
    public double getDollars() {
        return dollars;
    }

    @Transient
    public long getInterestCents() {
        return interestCents;
    }

    @Transient
    public double getInterestDollars() {
        return interestDollars;
    }

}