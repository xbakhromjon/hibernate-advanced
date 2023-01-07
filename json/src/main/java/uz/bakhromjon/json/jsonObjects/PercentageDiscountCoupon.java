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
public class PercentageDiscountCoupon extends DiscountCoupon {
    private BigDecimal percentage;

    public PercentageDiscountCoupon(String name, BigDecimal percentage) {
        super(name);
        this.percentage = percentage;
    }
}
