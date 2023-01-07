package uz.bakhromjon.json.jsonObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AmountDiscountCoupon extends DiscountCoupon {
    private BigDecimal amount;

    public AmountDiscountCoupon(String name, BigDecimal amount) {
        super(name);
        this.amount = amount;
    }
}
