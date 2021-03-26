package hu.webuni.hr.markmuhari.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "hr")
@Component
public class HrConfigProperties {
    private Salary salary = new Salary();

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public static class Salary {
        private Default def = new Default();
        private Smart smart;

        public Default getDef() {
            return def;
        }

        public void setDef(Default def) {
            this.def = def;
        }

        public Smart getSmart() {
            return smart;
        }

        public void setSmart(Smart smart) {
            this.smart = smart;
        }
    }

    public static class Default {
        private int percent;

        public int getPercent() {
            return percent;
        }

        public void setPercent(int percent) {
            this.percent = percent;
        }
    }

    public static class Smart {
        private int maxPaymentRaisePercentage;
        private int mediumPaymentRaisePercentage;
        private int minPaymentRaisePercentage;
        private Limit limit = new Limit();

        public int getMaxPaymentRaisePercentage() {
            return maxPaymentRaisePercentage;
        }

        public void setMaxPaymentRaisePercentage(int maxPaymentRaisePercentage) {
            this.maxPaymentRaisePercentage = maxPaymentRaisePercentage;
        }

        public int getMediumPaymentRaisePercentage() {
            return mediumPaymentRaisePercentage;
        }

        public void setMediumPaymentRaisePercentage(int mediumPaymentRaisePercentage) {
            this.mediumPaymentRaisePercentage = mediumPaymentRaisePercentage;
        }

        public int getMinPaymentRaisePercentage() {
            return minPaymentRaisePercentage;
        }

        public void setMinPaymentRaisePercentage(int minPaymentRaisePercentage) {
            this.minPaymentRaisePercentage = minPaymentRaisePercentage;
        }

        public Limit getLimit() {
            return limit;
        }

        public void setLimit(Limit limit) {
            this.limit = limit;
        }
    }

    public static class Limit {
        private int maxYearsOfPaymentRaise;
        private int medYearsOfPaymentRaise;
        private int minMonthsOfPaymentRaise;


        public int getMaxYearsOfPaymentRaise() {
            return maxYearsOfPaymentRaise;
        }

        public void setMaxYearsOfPaymentRaise(int maxYearsOfPaymentRaise) {
            this.maxYearsOfPaymentRaise = maxYearsOfPaymentRaise;
        }

        public int getMedYearsOfPaymentRaise() {
            return medYearsOfPaymentRaise;
        }

        public void setMedYearsOfPaymentRaise(int medYearsOfPaymentRaise) {
            this.medYearsOfPaymentRaise = medYearsOfPaymentRaise;
        }

        public int getMinMonthsOfPaymentRaise() {
            return minMonthsOfPaymentRaise;
        }

        public void setMinMonthsOfPaymentRaise(int minMonthsOfPaymentRaise) {
            this.minMonthsOfPaymentRaise = minMonthsOfPaymentRaise;
        }

    }


}
