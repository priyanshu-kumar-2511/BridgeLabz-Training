package dealtracker;

import java.time.LocalDate;

public class Promotion {

    protected String dealCode;
    protected LocalDate validTill;

    public Promotion(String dealCode, LocalDate validTill) {
        this.dealCode = dealCode;
        this.validTill = validTill;
    }

    public String getDealCode() {
        return dealCode;
    }

    public LocalDate getValidTill() {
        return validTill;
    }

    public boolean isExpired() {
        return validTill.isBefore(LocalDate.now());
    }
}
