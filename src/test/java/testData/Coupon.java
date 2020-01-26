package testData;

import org.apache.poi.ss.usermodel.DateUtil;
import utils.DateUtils;

public class Coupon {

    private String percent;
    private String uses;
    private String code;
    private String startDate;
    private String endDate;

    public Coupon (String percent, String uses, String code, String startDate, String endDate) {
        this.percent = percent;
        this.uses = uses;
        this.code = code;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getPercent() {
        return percent;
    }

    public String getUses() {
        return uses;
    }

    public String getCode() {
        return code;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
