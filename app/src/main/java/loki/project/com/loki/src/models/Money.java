package loki.project.com.loki.src.models;

import java.math.BigDecimal;

/**
 * Created by User on 4/14/2017.
 */

public class Money {
    private BigDecimal value;
    private String currency;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
